package com.plugin.photopicker.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.plugin.photopicker.PhotoPickerActivity;


/**
 * Created by donglua on 15/7/2.
 */
public class PhotoPickerIntent {
    public static final int REQUEST_PICK_IMAGE = 104;

    public static void setPhotoCount(Intent intent, int photoCount) {
        intent.putExtra(PhotoPickerActivity.EXTRA_MAX_COUNT, photoCount);
    }

    public static void setShowCamera(Intent intent, boolean showCamera) {
        intent.putExtra(PhotoPickerActivity.EXTRA_SHOW_CAMERA, showCamera);
    }

    public static void setShowGif(Intent intent, boolean showGif) {
        intent.putExtra(PhotoPickerActivity.EXTRA_SHOW_GIF, showGif);
    }

    public static void setPickAvatarMode(Intent intent) {
        intent.putExtra(PhotoPickerActivity.EXTRA_IS_PICK_AVATAR, true);
    }

    public static void setColumn(Intent intent, int column) {
        intent.putExtra(PhotoPickerActivity.EXTRA_GRID_COLUMN, column);
    }

    public static void startActivity(Context context, int photoCount, boolean showCamera, boolean showGif) {
        Intent intent = new Intent(context, PhotoPickerActivity.class);
        intent.putExtra(PhotoPickerActivity.EXTRA_MAX_COUNT, photoCount);
        intent.putExtra(PhotoPickerActivity.EXTRA_SHOW_CAMERA, showCamera);
        intent.putExtra(PhotoPickerActivity.EXTRA_SHOW_GIF, showGif);
        intent.putExtra(PhotoPickerActivity.EXTRA_IS_PICK_AVATAR, true);
        ((Activity) context).startActivityForResult(intent, REQUEST_PICK_IMAGE);
    }
}
