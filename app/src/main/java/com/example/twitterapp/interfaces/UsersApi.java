package com.example.twitterapp.interfaces;

import com.example.twitterapp.model.SignupResponse;
import com.example.twitterapp.model.Users;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UsersApi {

//register
@POST("register")
    Call<Void> registerUser(@Body Users users);

@FormUrlEncoded
    @POST("login")
    Call<SignupResponse> checkUser(@Field("email") String email, @Field("password") String password);
}
