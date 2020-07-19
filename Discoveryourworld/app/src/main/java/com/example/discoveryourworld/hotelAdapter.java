package com.example.discoveryourworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hotelAdapter extends RecyclerView.Adapter {

    ArrayList<hotel> hArray;

    public hotelAdapter(ArrayList<hotel> hArray) {
        this.hArray = hArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.res,parent,false);
        ViewHolder gr = new ViewHolder(v);


        return gr;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).image.setImageResource(hArray.get(position).getImg());
        ((ViewHolder)holder).cname.setText(hArray.get(position).getName());
        ((ViewHolder)holder).country.setText(hArray.get(position).getCounty());


    }

    @Override
    public int getItemCount() {
        return hArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView image ;
        public TextView cname ;
        public TextView country ;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            image = itemView.findViewById(R.id.imageView7);
            cname = itemView.findViewById(R.id.textView7);
            country = itemView.findViewById(R.id.textView4);
        }
    }
}
