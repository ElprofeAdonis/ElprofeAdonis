package com.example.elprofeadonis.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.elprofeadonis.R;
import com.example.elprofeadonis.activity.phpmyadminActivity;

public class IntroActivity extends AppCompatActivity {
    private Button Star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Star = (Button)findViewById(R.id.btnStar);

        Star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "si funciono", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(IntroActivity.this, phpmyadminActivity.class);
                startActivity(myIntent);
            }
        });
    }

    /*public void goToPhpmyad(View v) {
        Intent myIntent = new Intent(this, phpmyadminActivity.class);
        startActivity(myIntent);
    }*/
}