package com.example.twitterapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.twitterapp.R;
import com.example.twitterapp.Uri.Uri;
import com.example.twitterapp.interfaces.UsersApi;
import com.example.twitterapp.model.SignupResponse;

import retrofit2.Call;

public class LoginActivity extends AppCompatActivity {

    private TextView tvLSignup;
    private Button btnLogin;
    private Boolean isSuccess = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLSignup = findViewById(R.id.tvLSignup);
        btnLogin = findViewById(R.id.btnLogin);

        tvLSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });



    }

    public boolean checkUser(){


//        UsersApi usersApi = Uri.getInstant().create(UsersApi.class);
//        Call<SignupResponse> usercall = usersApi.checkUser(email, password);

        return isSuccess;
    }
}
