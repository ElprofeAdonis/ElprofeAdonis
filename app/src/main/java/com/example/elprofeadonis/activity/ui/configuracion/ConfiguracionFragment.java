package com.example.elprofeadonis.activity.ui.configuracion;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import com.example.elprofeadonis.R;


public class ConfiguracionFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuracion,container,false);

        TextView text = (TextView) view.findViewById(R.id.tvCorreo);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con el con la pagina web ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textayuda = (TextView) view.findViewById(R.id.texcomentario);
        textayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con el centro de ayudas en breve le ayudaremos ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textPreg = (TextView) view.findViewById(R.id.texpregunta);
        textPreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con el centro de preguntas ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textCont = (TextView) view.findViewById(R.id.texcontacto);
        textCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con nosotros, estamos para servirle ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textSoport = (TextView) view.findViewById(R.id.texsoporte);
        textSoport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con el centro de soport ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textTermi = (TextView) view.findViewById(R.id.texTerusos);
        textTermi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con los terminos y uso ",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textPrivasidad = (TextView) view.findViewById(R.id.texPoliticas);
        textPrivasidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando a las politicas de privacidad ",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}


