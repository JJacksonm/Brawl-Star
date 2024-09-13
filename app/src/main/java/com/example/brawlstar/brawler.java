package com.example.brawlstar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class brawler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brawler);
    }
    public void MainActivity(View view) {
        Intent MainActivity = new Intent(brawler.this, MainActivity.class);
        this.startActivity(MainActivity);
    }
    public void mapas(View view) {
        Intent mapas = new Intent(brawler.this, mapas.class);
        this.startActivity(mapas);
    }
}