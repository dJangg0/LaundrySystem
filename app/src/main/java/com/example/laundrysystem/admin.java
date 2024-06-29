package com.example.laundrysystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin extends AppCompatActivity {

    public Button btn_user;
    public Button btn_admin;
    public Button btn_sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);

        btn_user = (Button)findViewById(R.id.btn_user);
        btn_admin = (Button) findViewById(R.id.btn_admin);
        btn_sign_up = (Button)findViewById(R.id.btn_sign_up);

        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin.this, user.class);
                startActivity(intent);
            }
        });


            btn_admin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(admin.this, admin.class);
                    startActivity(intent);
                }
            });


            btn_sign_up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(admin.this, admin.class);
                    startActivity(intent);
                }
            });

    }





}