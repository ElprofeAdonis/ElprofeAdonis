package com.example.elprofeadonis.recyclertrimestre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.elprofeadonis.R;
import com.example.elprofeadonis.recyclerMenu.MenuclaseModel;

import java.util.ArrayList;

public class Trimestre_setimo_Activity extends AppCompatActivity {

    ArrayList<TrimestreSetimo> yokoModels = new ArrayList<>();
    int [] yokoImages = {R.drawable.octavo,R.drawable.octavo,R.drawable.octavo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimestre_setimo);

        RecyclerView recyclerView = findViewById(R.id.listRecyclerView1);

        setUpyokoModels();

        TT_SettimoAdapter adapter = new TT_SettimoAdapter(this,
                yokoModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setUpyokoModels(){
        String[] yokoNames = getResources().getStringArray(R.array.trimestres_colegio);

        for (int adb = 0; adb<yokoNames.length;adb++){
            yokoModels.add(new TrimestreSetimo(yokoNames[adb], yokoImages[adb]));
        }
    }
}