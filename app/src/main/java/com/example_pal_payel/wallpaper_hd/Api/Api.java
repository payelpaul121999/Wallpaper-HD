package com.example_pal_payel.wallpaper_hd.Api;

import com.example_pal_payel.wallpaper_hd.Models.WallpaperResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface Api {
    @GET("curated/?page=1&per_page=80")
    Call<WallpaperResponse> getWallpaper(
            @Header("Authorization") String credentails
    );
    @GET("search?")
    Call<WallpaperResponse> getSearch(

            @Header("Authorization") String credentials,
            @Query("query") String queryText
    );
}
