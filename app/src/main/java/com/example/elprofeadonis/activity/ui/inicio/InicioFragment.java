package com.example.elprofeadonis.activity.ui.inicio;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.elprofeadonis.R;

import com.example.elprofeadonis.activity.IntroActivity;
import com.example.elprofeadonis.activity.PresentacionInicio;
import com.example.elprofeadonis.activity.RegistrarUsuarioActivity;
import com.example.elprofeadonis.activity.ViewAtraccionesActivity2;
import com.example.elprofeadonis.activity.VistaActividadesActivity2;
import com.example.elprofeadonis.activity.ui.organizacion.OrganizacionFragment;
import com.example.elprofeadonis.recyclerMenu.RecyclerActivity;
import com.example.elprofeadonis.recyclertrimestre.Trimestre_setimo_Activity;


public class InicioFragment extends Fragment {
    public CardView button = null;
    public CardView mycard = null;
    public CardView funciona = null;
    public CardView funciona1 = null;


    Intent intent,intent2, intent1,intent3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_inicio, container, false);

        intent = new Intent(getActivity(), RegistrarUsuarioActivity.class);
        button = (CardView) rootView.findViewById(R.id.cardJugar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        intent2 = new Intent(getActivity(), RecyclerActivity.class);
        mycard = (CardView) rootView.findViewById(R.id.cardUser);
        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent2);
                Toast.makeText(getActivity(),"mostrarMenu desde el activity",Toast.LENGTH_SHORT).show();
            }
        });
        intent1 = new Intent(getActivity(), ViewAtraccionesActivity2.class);
        funciona = (CardView) rootView.findViewById(R.id.cardRanking);
        funciona.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent1);
                Toast.makeText(getActivity(),"Bienvenido al trimestres asignado",Toast.LENGTH_SHORT).show();
            }
        });
        intent3 = new Intent(getActivity(), VistaActividadesActivity2.class);
        funciona1 = (CardView) rootView.findViewById(R.id.cardAyuda);
        funciona1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intent3);
                Toast.makeText(getActivity(),"Bienvenido al trimestres asignado",Toast.LENGTH_SHORT).show();
            }
        });



        return rootView;
    }




    public interface OnFragmentInteractionListener {

    }

}