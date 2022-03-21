package com.example_pal_payel.wallpaper_hd.Models;

import com.google.gson.annotations.SerializedName;

public class ImageViewsDimensions {

    @SerializedName("medium")
     private String medium;

    @SerializedName("large")
     private String large;

    public ImageViewsDimensions(String medium, String large) {
        this.medium = medium;
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }
}


