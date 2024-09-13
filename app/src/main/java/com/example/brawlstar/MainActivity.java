package com.example.brawlstar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void brawler(View view) {
        Intent brawler = new Intent(MainActivity.this, brawler.class);
        this.startActivity(brawler);
    }
    public void mapas(View view) {
        Intent mapas = new Intent(MainActivity.this, mapas.class);
        this.startActivity(mapas);
    }
}