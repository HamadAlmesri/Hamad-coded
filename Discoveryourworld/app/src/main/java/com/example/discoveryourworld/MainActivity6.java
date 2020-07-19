package com.example.discoveryourworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        ArrayList<mus> mu = new ArrayList<>();

        mus p1 = new mus("عالم دزني",R.drawable.ds,"باريس",1);
        mus p2 = new mus("عالم فراري",R.drawable.f,"ابو ظبي",2);
        mus p3 = new mus("دريم لاند",R.drawable.d,"الامارات",3);
        mus p4 = new mus("أيانابا",R.drawable.i,"قبرص",4);
        mus p5 = new mus("عالم فراري",R.drawable.f,"ابو ظبي",5);


        mu.add(p1);
        mu.add(p2);
        mu.add(p3);
        mu.add(p4);
        mu.add(p5);

        RecyclerView gggr = findViewById(R.id.RecyclerView2);
        gggr.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        gggr.setLayoutManager(lm);



        musAdapter Adapter = new musAdapter(mu);
        gggr.setAdapter(Adapter);
    }
}