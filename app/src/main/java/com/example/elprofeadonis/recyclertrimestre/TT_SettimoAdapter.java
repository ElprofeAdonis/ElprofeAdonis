package com.example.elprofeadonis.recyclertrimestre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elprofeadonis.R;

import java.util.ArrayList;

public class TT_SettimoAdapter extends RecyclerView.Adapter<TT_SettimoAdapter.MyViewHolder> {
    //segundo paso a realizar
    Context context;
    ArrayList<TrimestreSetimo> yokoModels;

    public TT_SettimoAdapter(Context context, ArrayList<TrimestreSetimo> yokoModels){
        this.context = context;
        this.yokoModels = yokoModels;
    }
    @NonNull
    @Override
    public TT_SettimoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //quiento parte por seguir..
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.disenio_trimestres, parent, false);
        return new TT_SettimoAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TT_SettimoAdapter.MyViewHolder holder, int position) {
        //Cuarto paso a proceguir...

        holder.tvSeptimo.setText(yokoModels.get(position).getYokoName());
        holder.imaView.setImageResource(yokoModels.get(position).getImages());

    }

    @Override
    public int getItemCount() {
        //Tercer paso a proseguir...
        return yokoModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //primer paso a realizar...
        ImageView imaView;
        TextView tvSeptimo;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            imaView = itemView.findViewById(R.id.IMGsegundo);
            tvSeptimo = itemView.findViewById(R.id.texTrimetreSetimo);
        }
    }
}
