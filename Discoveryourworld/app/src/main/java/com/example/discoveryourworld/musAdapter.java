package com.example.discoveryourworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class musAdapter extends RecyclerView.Adapter{


    ArrayList<mus> mArray ;

    public musAdapter(ArrayList<mus> mArray) {
        this.mArray = mArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.res,parent,false);
        resAdapater.ViewHolder gr = new resAdapater.ViewHolder(v);
        return gr;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((resAdapater.ViewHolder)holder).image.setImageResource(mArray.get(position).getImage());
        ((resAdapater.ViewHolder)holder).cname.setText(mArray.get(position).getName());
        ((resAdapater.ViewHolder)holder).country.setText(mArray.get(position).getCountry());

    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView cname;
        public TextView country;
        public TextView rate;
        public View view;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            cname = itemView.findViewById(R.id.textView7);
            image = itemView.findViewById(R.id.imageView7);
            country = itemView.findViewById(R.id.textView4);




        }
    }
}
