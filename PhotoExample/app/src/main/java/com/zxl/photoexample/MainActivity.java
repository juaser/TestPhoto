package com.zxl.photoexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.plugin.photopicker.PhotoPickerActivity;
import com.plugin.photopicker.utils.PhotoPagerIntent;
import com.plugin.photopicker.utils.PhotoPickerIntent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList photos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (photos.size() > 0) {
                    PhotoPagerIntent.startActivity(MainActivity.this, 0, photos, false);
                } else {
                    PhotoPickerIntent.startActivity(MainActivity.this, 5, true, false);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && data != null) {
            switch (requestCode) {
                case PhotoPickerIntent.REQUEST_PICK_IMAGE:
                    photos.clear();
                    photos.addAll(data.getStringArrayListExtra(PhotoPickerActivity.KEY_SELECTED_PHOTOS));
                    Log.e("ＴＡＧ", "图片选择返回" + photos.size() + "张");
                    break;
                case PhotoPagerIntent.REQUEST_PHOTO_SHOW:
                    photos.clear();
                    photos.addAll(data.getStringArrayListExtra(PhotoPickerActivity.KEY_SELECTED_PHOTOS));
                    Log.e("ＴＡＧ", "图片展示返回" + photos.size() + "张");
                    break;
            }
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
