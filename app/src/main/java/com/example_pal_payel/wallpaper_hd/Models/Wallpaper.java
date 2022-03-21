package com.example_pal_payel.wallpaper_hd.Models;

import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

public class Wallpaper {
    @SerializedName("src")
    private ImageViewsDimensions src;

    public Wallpaper(ImageViewsDimensions src) {
        this.src = src;
    }

    public ImageViewsDimensions getSrc() {
        return src;
    }

    public void setSrc(ImageViewsDimensions src) {
        this.src = src;
    }
}
