package com.example.discoveryourworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ArrayList<hotel> hot = new ArrayList<>();

        hotel p1 = new hotel("فندق الريجنسي",R.drawable.reg,"الكويت",1);
        hotel p2 = new hotel("فندق جميرا",R.drawable.jme,"الكويت",2);



        hot.add(p1);
        hot.add(p2);


        RecyclerView ggr = findViewById(R.id.RecyclerView1);
        ggr.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        ggr.setLayoutManager(lm);




        hotelAdapter Adapter = new hotelAdapter(hot);
        ggr.setAdapter(Adapter);


    }
}