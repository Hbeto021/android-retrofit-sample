package com.home.project.android_retrofit_sample.data.webdata;

import com.home.project.android_retrofit_sample.domain.model.City;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Class that consumes api web service
 */

public interface ApiService {

    //url from specific method that returns a response converted in my model class
    @GET("bins/vwprc")
    Call<City> getService();
}
