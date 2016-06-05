package com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popularMovies,stockHawk,buildItBigger,makeYourAppMaterial,goUbiquitous,capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popularMovies = (Button) findViewById(R.id.button);
        stockHawk = (Button) findViewById(R.id.button2);
        buildItBigger = (Button) findViewById(R.id.button3);
        makeYourAppMaterial = (Button) findViewById(R.id.button4);
        goUbiquitous = (Button) findViewById(R.id.button5);
        capstone = (Button) findViewById(R.id.button6);

        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Popular Movies app!",Toast.LENGTH_SHORT).show();
            }
        });

        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Stock Hawk app!",Toast.LENGTH_SHORT).show();
            }
        });

        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger app!",Toast.LENGTH_SHORT).show();
            }
        });

        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Make your App Material app!",Toast.LENGTH_SHORT).show();
            }
        });

        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Go Ubiquitous app!",Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch Capstone app!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
