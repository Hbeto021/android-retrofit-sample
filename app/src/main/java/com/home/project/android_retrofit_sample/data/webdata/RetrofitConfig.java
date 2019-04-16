package com.home.project.android_retrofit_sample.data;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("base/url")
                .addConverterFactory(JacksonConverterFactory.)
    }
}
