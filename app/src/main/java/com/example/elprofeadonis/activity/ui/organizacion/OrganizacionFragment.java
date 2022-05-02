package com.example.elprofeadonis.activity.ui.organizacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.elprofeadonis.R;

public class OrganizacionFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_organizacion, container, false);

        Switch xxxx = (Switch) view.findViewById(R.id.citas);
        xxxx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de citas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch aaa = (Switch) view.findViewById(R.id.educacion);
        aaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando a las reuniones programadas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch bbb = (Switch) view.findViewById(R.id.consultas);
        bbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de consultas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch ccc = (Switch) view.findViewById(R.id.calificar);
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado por calificar ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch ddd = (Switch) view.findViewById(R.id.conferencias);
        ddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de consultas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch fff = (Switch) view.findViewById(R.id.eventos);
        fff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de eventos ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch ggg = (Switch) view.findViewById(R.id.tutorias);
        ggg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de consultas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch hhh = (Switch) view.findViewById(R.id.Entrevistas);
        hhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de entrevistas ", Toast.LENGTH_SHORT).show();
            }
        });
        Switch jjj = (Switch) view.findViewById(R.id.alhogar);
        jjj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de informe al hogar", Toast.LENGTH_SHORT).show();
            }
        });
        Switch kkk = (Switch) view.findViewById(R.id.Entretiminetos);
        kkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de informe al entretenimientos", Toast.LENGTH_SHORT).show();
            }
        });
        Switch lll = (Switch) view.findViewById(R.id.Evento);
        lll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de eventos", Toast.LENGTH_SHORT).show();
            }
        });
        Switch mmm = (Switch) view.findViewById(R.id.Horario);
        mmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Conectando con el apartado de Horarios", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

}





