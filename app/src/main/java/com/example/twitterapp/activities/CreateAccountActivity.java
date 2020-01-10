package com.example.twitterapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.twitterapp.R;

public class CreateAccountActivity extends AppCompatActivity {

    private Button btnCANext;
    private ImageButton btnBackImage;
    private EditText etName, etPhoneEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnCANext = findViewById(R.id.btnCreateAccountNext);
        etName = findViewById(R.id.etCName);
        etPhoneEmail = findViewById(R.id.etCPhoneEmail);

        btnBackImage = findViewById(R.id.btnCBackButton);

        btnCANext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String email = etPhoneEmail.getText().toString();

                    Intent intent = new Intent(CreateAccountActivity.this, acceptPolicyActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email",email);
                    startActivity(intent);

            }
        });

        btnBackImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountActivity.this, FirstSignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
