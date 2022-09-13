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

public class myRecyclerView extends RecyclerView.Adapter<myRecyclerView.MyViewHolder>{

    ArrayList<String> listSurah;

    public myRecyclerView(ArrayList<String> surahList) {
        this.listSurah = surahList;
    }

    @NonNull
    @Override
    public myRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerView.MyViewHolder holder, int position) {
        //holder.data=listSurah.get(position);
        holder.textViewFriendName.setText(listSurah.get(position));
        holder.imageViewFriend.setImageResource(R.drawable.surah_con);
    }

    @Override
    public int getItemCount() {
        return listSurah.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewFriend;
        TextView textViewFriendName;
        //String data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFriend = itemView.findViewById(R.id.imageViewFriendPicture);
            textViewFriendName = itemView.findViewById(R.id.textViewFriendName);
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
