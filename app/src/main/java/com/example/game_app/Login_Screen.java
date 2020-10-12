package com.example.game_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_Screen extends AppCompatActivity {

    TextView signup;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);

    signup= findViewById(R.id.id_text_signup);
    login= findViewById(R.id.login_button);

    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Login_Screen.this,Register_screen.class);
            startActivity(intent);
        }
    });


    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent=new Intent(Login_Screen.this,MainActivity.class);
            startActivity(intent);

        }
    });

    }
}
