package com.example.discoveryourworld;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class resAdapater extends RecyclerView.Adapter {

    ArrayList<res> rArray ;

    public resAdapater(ArrayList<res> rArray) {
        this.rArray = rArray;
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
        ((ViewHolder)holder).image.setImageResource(rArray.get(position).getImage());
        ((ViewHolder)holder).cname.setText(rArray.get(position).getName());
        ((ViewHolder)holder).country.setText(rArray.get(position).getCountry());
    }

    @Override
    public int getItemCount() {
        return rArray.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
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
