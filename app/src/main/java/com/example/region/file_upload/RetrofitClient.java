package com.example.region.file_upload;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class RetrofitClient {

    private static Retrofit getRetrofit() {
        Retrofit retrofit2 = new Retrofit.Builder().baseUrl("http://merchapi.promerkez.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit2;
    }

    public static Api getUploadApiInterface() {
        Api api = getRetrofit().create(Api.class);
        return api;
    }

}
