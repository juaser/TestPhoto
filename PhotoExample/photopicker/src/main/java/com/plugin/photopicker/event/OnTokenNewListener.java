package com.plugin.photopicker.event;

/**
 * Created by JianQiang on 2016/6/3.
 */
public interface OnTokenNewListener {
    void onTokenNewPicture(String path);

    boolean isPickAvatar();
}
