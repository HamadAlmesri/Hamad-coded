package com.example.discoveryourworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<res> Res = new ArrayList<>();
        res p1 = new res("ووب",R.drawable.woop,"الكويت",1);
        res p2 = new res("اوفر جار",R.drawable.overjar,"الكويت",2);
        res p3 = new res("جكن",R.drawable.chkn,"الكويت",3);
        res p4 = new res("جوكو ميلت",R.drawable.chocomelt,"الكويت",4);
        res p5 = new res("جكن جويس" ,R.drawable.chknch,"الكويت",5);

        Res.add(p1);
        Res.add(p2);
        Res.add(p3);
        Res.add(p4);
        Res.add(p5);


        RecyclerView gg = findViewById(R.id.RecyclerView);
        gg.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        gg.setLayoutManager(lm);




        resAdapater Adapter = new resAdapater(Res);
        gg.setAdapter(Adapter);
    }
}