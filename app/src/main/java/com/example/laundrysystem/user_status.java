package com.example.laundrysystem;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_status extends AppCompatActivity {

    public ImageButton btn_laundry;
    public ImageButton btn_status;
    public ImageButton btn_history;
    public ImageButton btn_profile;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_status);

        btn_laundry = (ImageButton) findViewById(R.id.btn_laundry);
        btn_status = (ImageButton) findViewById(R.id.btn_status);
        btn_history = (ImageButton) findViewById(R.id.btn_history);
        btn_profile = (ImageButton) findViewById(R.id.btn_profile);

    btn_laundry.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(user_status.this, user_home_screen.class);
            startActivity(intent);
        }
    });

    btn_status.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(user_status.this, user_status.class);
            startActivity(intent);
        }
    });

    btn_history.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(user_status.this, user_history.class);
            startActivity(intent);
        }
    });

    btn_profile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(user_status.this, user_profile.class);
            startActivity(intent);
        }
    });

    }//end of user_status function
}//end of class
