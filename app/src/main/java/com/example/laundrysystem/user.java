package com.example.laundrysystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user extends AppCompatActivity {

    public Button btn_user;
    public Button btn_admin;
    public Button btn_login;
    public Button btn_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        btn_user = (Button)findViewById(R.id.btn_user);
        btn_admin = (Button) findViewById(R.id.btn_admin);
        btn_login = (Button)findViewById(R.id.btn_login) ;
        btn_signUp = (Button) findViewById(R.id.btn_sign_up);

        btn_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, user.class);
                startActivity(intent);
            }
        });


        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, admin.class);
                startActivity(intent);
            }
        });


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, user_home_screen.class);
                startActivity(intent);
            }
        });

        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, signup_user.class);
                startActivity(intent);
            }
        });
    }//end of protected void

}//end of class
