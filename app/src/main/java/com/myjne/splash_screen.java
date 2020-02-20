package com.myjne;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class splash_screen extends Activity {
    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading makan akan berpindah ke home dari splash screen
                Intent home=new Intent(splash_screen.this, home.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }
}
