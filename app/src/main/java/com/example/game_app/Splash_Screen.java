package com.example.game_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class Splash_Screen extends AppCompatActivity {

    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);


        countDownTimer= new CountDownTimer(2800, 600) {

            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {

                startActivity(new Intent(Splash_Screen.this,Login_Screen.class));
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                finish();
            }
        }.start();

        //end of counterTimer
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();
    }

}
