package com.plugin.photopicker.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.plugin.photopicker.PhotoPagerActivity;

import java.util.ArrayList;

/**
 * @类说明:
 * @author:zxl on 16-7-31.
 */
public class PhotoPagerIntent {
    public static final int REQUEST_PHOTO_SHOW = 103;

    public static void startActivity(Context context, int current_item, ArrayList<String> photos, boolean show_delete) {
        Intent intent = new Intent(context, PhotoPagerActivity.class);
        intent.putExtra(PhotoPagerActivity.EXTRA_CURRENT_ITEM, 0);
        intent.putExtra(PhotoPagerActivity.EXTRA_PHOTOS, photos);
        intent.putExtra(PhotoPagerActivity.EXTRA_SHOW_DELETE, true);
        ((Activity) context).startActivityForResult(intent, REQUEST_PHOTO_SHOW);
    }
}
