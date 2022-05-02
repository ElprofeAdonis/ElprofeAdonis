package com.example.elprofeadonis.activity.ui.compras;


import android.graphics.Color;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.elprofeadonis.R;

import com.example.elprofeadonis.adapter.SliderAdapter;
import com.example.elprofeadonis.entity.SliderItem;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MisComprasFragment extends Fragment {
    private SliderView svCarrusel;
    private SliderAdapter sliderAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mis_compras, container, false);

        CircleImageView btnweb = (CircleImageView) view.findViewById(R.id.icoBlog);
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con la web aficial",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btnYou = (ImageButton) view.findViewById(R.id.icoYoutube);
        btnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"Conectando con Youtube",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btnFace = (ImageButton) view.findViewById(R.id.icoFace);
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con Facebook",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btnIns = (ImageButton) view.findViewById(R.id.icoInstagram);
        btnIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con Instagram",Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton btnTwi = (ImageButton) view.findViewById(R.id.icoTwitter);
        btnTwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Conectando con Twitter",Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        initAdapter();
        loadData();
    }

    private void init(View v) {
        svCarrusel = v.findViewById(R.id.svCarrusel);
    }

    private void initAdapter() {
        sliderAdapter  = new SliderAdapter(getContext());

        svCarrusel.setSliderAdapter(sliderAdapter);

        svCarrusel.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        svCarrusel.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        svCarrusel.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        svCarrusel.setIndicatorSelectedColor(Color.WHITE);
        svCarrusel.setIndicatorUnselectedColor(Color.GRAY);
        svCarrusel.setScrollTimeInSec(4); //set scroll delay in seconds :
        svCarrusel.startAutoCycle();

        //listAdapter = new ListAdapter(elements, this);
        //rcvpropiedades.setAdapter(listAdapter);

    }
    private void loadData(){
        List<SliderItem> lista = new ArrayList<>();
        lista.add(new SliderItem(R.drawable.ea, "Somos su mejor opcion"));
        lista.add(new SliderItem(R.drawable.ceabcr, "Somos su mejor opcion"));
        lista.add(new SliderItem(R.drawable.amp, "Somos su mejor opcion"));
        lista.add(new SliderItem(R.drawable.edu, "Somos su mejor opcion"));
        lista.add(new SliderItem(R.drawable.eeu, "Somos su mejor opcion"));
        lista.add(new SliderItem(R.drawable.edyoutube, "Somos su mejor opcion"));
        sliderAdapter.updateIten(lista);
    }

}