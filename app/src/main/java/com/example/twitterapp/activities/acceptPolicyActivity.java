package com.example.twitterapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.twitterapp.R;

public class acceptPolicyActivity extends AppCompatActivity {

    private ImageButton ibBackbutton;
    private Button btnNext;
    private EditText etname, etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept_policy);

        ibBackbutton = findViewById(R.id.ibAPBackButton);
        btnNext = findViewById(R.id.btnAPNext);
        etname = findViewById(R.id.etAPName);
        etPhone = findViewById(R.id.etAPPhone);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            etname.setText(bundle.getString("Name"));
            etPhone.setText(bundle.getString("Email"));
        }

       btnNext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(acceptPolicyActivity.this, VerificationActivity.class);
               intent.putExtra("Name", etname.getText().toString());
               intent.putExtra("Email", etPhone.getText().toString());
               startActivity(intent);
           }
       });

        ibBackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(acceptPolicyActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

    }
}
