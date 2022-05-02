package com.example.elprofeadonis.recyclerMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.elprofeadonis.R;
import com.example.elprofeadonis.recyclertrimestre.Trimestre_setimo_Activity;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {


    ArrayList<MenuclaseModel> aminoAcidModels = new ArrayList<>();

    int [] aminoAcidImages = {R.drawable.setimo, R.drawable.setimo, R.drawable.setimo,
            R.drawable.setimo, R.drawable.setimo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);

        setUpmenuclaseModels();
        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this,
                aminoAcidModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpmenuclaseModels(){
        String[] aminoAcidNames = getResources().getStringArray(R.array.grados_generales);

        for (int i = 0; i<aminoAcidNames.length;i++){
            aminoAcidModels.add(new MenuclaseModel(aminoAcidNames[i],aminoAcidImages[i]));
        }
    }
    public void Mensaje(View view){
        Toast notificacion = Toast.makeText(this,"Conectando con los diferentes trimestres ",Toast.LENGTH_LONG);
        notificacion.show();
    }

}