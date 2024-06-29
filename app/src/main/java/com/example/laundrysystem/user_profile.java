package com.example.laundrysystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_profile extends AppCompatActivity {

    public Button btn_back;
    public Button btn_uploadImage;
    public Button btn_editProfile;
    public Button btn_logout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        btn_back = (Button) findViewById(R.id.btn_back_userprofile);
        btn_uploadImage = (Button) findViewById(R.id.btn_upload_image_userprofile);
        btn_editProfile = (Button) findViewById(R.id.btn_edit_profile_userprofile);
        btn_logout = (Button) findViewById(R.id.btn_logout_userprofile);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_profile.this, user_home_screen.class);
                startActivity(intent);
            }
        });

//        btn_uploadImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent inent = new Intent(user_profile.this, )
//            }
//        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_profile.this, user.class);
                startActivity(intent);
            }
        });

    }//end of function
}//end of class
