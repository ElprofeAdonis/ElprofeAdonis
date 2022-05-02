package com.example.elprofeadonis.recyclerMenu;

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

public class AA_RecyclerViewAdapter extends RecyclerView.Adapter<AA_RecyclerViewAdapter.MyViewHolder> {
    // segundo paso para declarar en el Adapter
    Context context;
    ArrayList<MenuclaseModel> aminoAcidModels;

    public AA_RecyclerViewAdapter(Context context, ArrayList<MenuclaseModel> aminoAcidModels){
        this.context = context;
        this.aminoAcidModels = aminoAcidModels;

    }
    @NonNull
    @Override
    public AA_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // quinto paso paso para declarar en el Adapter
        LayoutInflater inflater = LayoutInflater.from(context);
        //revisar el layaout...
        // revisado y corregido por Adonis...
        View view = inflater.inflate(R.layout.list_element, parent, false);

        return new AA_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerViewAdapter.MyViewHolder holder, int position) {
        // cuarto paso paso para declarar en el Adapter

        holder.tvName.setText(aminoAcidModels.get(position).getAminoAcidName());
        holder.imageView.setImageResource(aminoAcidModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        // tercer paso para declarar en el Adapter
        return aminoAcidModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        // primer paso para declarar en el Adapter
        ImageView imageView;
        TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView3);
            tvName = itemView.findViewById(R.id.texSeptimo);


        }
    }
}
