package com.example.discoveryourworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class MainActivity extends AppCompatActivity {

    private int[] img = new int[] {
        R.drawable.wallpaper , R.drawable.wallpaper1 , R.drawable.wallpaper2 , R.drawable.wallpaper3 , R.drawable.wallpaper4
    };
    private String[] title = new String[]{
            "KW" , "UAE" , "BAH" , "USA" , "Unknown"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button start = findViewById(R.id.start);
        CarouselView C = findViewById(R.id.carouselView);
        C.setPageCount(img.length);
        C.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(img[position]);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(a);
            }
        });

    }
}