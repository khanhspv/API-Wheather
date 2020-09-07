package com.pvk.khanhpham.thoi_tiet.network;


import com.pvk.khanhpham.thoi_tiet.model.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiManager {

    public static String BASE_URL = "http://dataservice.accuweather.com";

    @GET("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/353412?apikey=tbFOLXfZmAxAexEYOmXhcxnbZBDjQBSh&language=vi-vn&metric=true")
    Call<List<Wheather>> gethour();

    @GET("http://dataservice.accuweather.com/forecasts/v1/daily/5day/353412?apikey=tbFOLXfZmAxAexEYOmXhcxnbZBDjQBSh&language=vi-vn&metric=true")
    Call<List<Wheather>> getDay();


}
