package com.example.twitterapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.twitterapp.R;

public class PasswordActivity extends AppCompatActivity {

    private EditText etPassword;
    private Button btnNext;
    private String name, email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        etPassword = findViewById(R.id.etPPassword);
        btnNext = findViewById(R.id.btnPNext);

        if (etPassword.getText().toString().equals("")) {
            btnNext.setClickable(false);
        }
        else {
            btnNext.setClickable(true);
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                if(bundle != null){
                    name = bundle.getString("Name");
                    email = bundle.getString("Email");
                }
                Intent intent = new Intent(PasswordActivity.this, ImageSelectActivity.class);
                intent.putExtra("Name",name);
                intent.putExtra("Email",email);
                intent.putExtra("Password",etPassword.getText().toString());
                startActivity(intent);

            }
        });
    }
}
