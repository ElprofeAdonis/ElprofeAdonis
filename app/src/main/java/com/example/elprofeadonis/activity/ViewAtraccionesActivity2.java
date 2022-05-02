package com.example.elprofeadonis.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.elprofeadonis.R;

public class ViewAtraccionesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_atracciones2);
    }
    public void Mensaje(View view){
        Toast notificacion = Toast.makeText(this,"Conectando Al primer trimestre ",Toast.LENGTH_LONG);
        notificacion.show();
    }
    public void Mensaje1(View view){
        Toast notificacion = Toast.makeText(this,"Conectando al segundo trimestre ",Toast.LENGTH_LONG);
        notificacion.show();
    }
    public void Mensaje2(View view){
        Toast notificacion = Toast.makeText(this,"Conectando al trecer trimestre ",Toast.LENGTH_LONG);
        notificacion.show();
    }
    public void Mensaje3(View view){
        Toast notificacion = Toast.makeText(this,"Conectando al cuarto trimestre ",Toast.LENGTH_LONG);
        notificacion.show();
    }

}