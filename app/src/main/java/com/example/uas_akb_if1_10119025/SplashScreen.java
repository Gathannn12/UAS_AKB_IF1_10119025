package com.example.uas_akb_if1_10119025;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

/*NIM  : 10119025
* Nama : Adhira Fahri Gathan
* Kelas : IF-1*/

public class SplashScreen extends AppCompatActivity {

    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, SliderActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);
    }
}