package com.example.twitterapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.twitterapp.R;

public class VerificationActivity extends AppCompatActivity {

    private Button btnVNext;
    private EditText etVCode;
    private String name, email;
    private ImageButton ibVBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        etVCode = findViewById(R.id.etVCode);
        btnVNext = findViewById(R.id.btnVNext);
        ibVBackButton = findViewById(R.id.ibVBackButton);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("Name");
            email = bundle.getString("Email");
        }

        etVCode.setText("145878");

        btnVNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etVCode.getText().toString().equals("145878")) {
                    Intent intent = new Intent(VerificationActivity.this, PasswordActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email", email);
                    startActivity(intent);
                }
            }
        });

        ibVBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
