package com.example.elprofeadonis.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;


import com.example.elprofeadonis.R;
import com.example.elprofeadonis.activity.ui.inicio.InicioFragment;


public class MainActivity extends AppCompatActivity implements InicioFragment.OnFragmentInteractionListener {
    Fragment fragmentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();
    }

}