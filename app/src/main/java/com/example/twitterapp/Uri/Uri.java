package com.example.twitterapp.Uri;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Uri {

    public static final String base_url = "http://10.0.2.2:3000/";


    //creating retrofit to convert json format to Gson
    public static Retrofit getInstant() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
