package com.example.twitterapp.interfaces;

import com.example.twitterapp.model.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TwitterApi {

//register
@POST("register")
    Call<Void> registerUser(@Body Users users);

}
