package com.example.game_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register_screen extends AppCompatActivity {
    TextView already_sigin;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

    signup= findViewById(R.id.id_signup_button);
    already_sigin= findViewById(R.id.id_already_signin);

    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Register_screen.this, Login_Screen.class);
            startActivity(intent);
        }
    });



    already_sigin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Register_screen.this, Login_Screen.class);
            startActivity(intent);
        }
    });


    }

}
