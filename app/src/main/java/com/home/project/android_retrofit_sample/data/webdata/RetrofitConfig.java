package com.home.project.android_retrofit_sample.data.webdata;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * This class prepare the retrofit object with base url, converters, interceptos, clients...
 */

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/") //set the base url of api web service
                .addConverterFactory(JacksonConverterFactory.create()) //set a Json converter to Retrofit
                .build(); //build Retrofit
    }


    //create my ApiService with my retrofit object
    public ApiService getApiService(){
        return this.retrofit.create(ApiService.class);
    }
}
