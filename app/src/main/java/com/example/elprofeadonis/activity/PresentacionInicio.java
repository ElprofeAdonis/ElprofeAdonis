package com.example.elprofeadonis.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.elprofeadonis.R;

public class PresentacionInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion_inicio);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(PresentacionInicio.this,IntroActivity.class);
                startActivity(intent);
                finish();
            }

        }, 3000);
    }
}