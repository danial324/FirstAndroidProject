package com.example.myappquran1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myRecyclerViewUAyah extends RecyclerView.Adapter<myRecyclerViewUAyah.MyViewHolder>{

    ArrayList<Urdu_Ayah> listSurah;

    public myRecyclerViewUAyah(ArrayList<Urdu_Ayah> urdu_ayah) {
        this.listSurah = urdu_ayah;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.urdu_ayah, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Urdu_Ayah urdu_ayah1 = listSurah.get(position);
        holder.ayah1.setText(urdu_ayah1.getEngAyah());
        holder.urdu1.setText(urdu_ayah1.getEngTranslation());
    }

    @Override
    public int getItemCount() {
        return listSurah.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ayah1;
        TextView urdu1;
        //String data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ayah1 = itemView.findViewById(R.id.ayah1);
            urdu1 = itemView.findViewById(R.id.urdu1);
            //itemView.setOnClickListener((View.OnClickListener) this);
        }

        /*@Override
        public void onClick(View view) {
            int position= getAdapterPosition();
            Context context = null;
            Intent intent=new Intent(context, Surah_Display.class);
            intent.putExtra("Surah_no",position+1);
            context.startActivity(intent);
        }*/
    }
}
