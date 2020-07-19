package com.example.discoveryourworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        CircleImageView cy = findViewById(R.id.fork);
        CircleImageView hotel = findViewById(R.id.hotel);
        CircleImageView mus = findViewById(R.id.mus);
        ImageView kw = findViewById(R.id.kw);
        ImageView sa = findViewById(R.id.sa);
        ImageView uae = findViewById(R.id.uae);



        cy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(g);
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gg = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(gg);
            }
        });
        mus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gr = new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(gr);
            }
        });
        kw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ggr = new Intent(MainActivity3.this,MainActivity8.class);
                startActivity(ggr);
            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity3.this,MainActivity7.class);
                startActivity(b);
            }
        });
        uae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity3.this,MainActivity9.class);
                startActivity(g);
            }
        });



    }
}