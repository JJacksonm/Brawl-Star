package com.example.brawlstar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mapas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);
    }
    public void MainActivity(View view) {
        Intent MainActivity = new Intent(mapas.this, MainActivity.class);
        this.startActivity(MainActivity);
    }
    public void brawler(View view) {
        Intent brawler = new Intent(mapas.this, brawler.class);
        this.startActivity(brawler);
    }
}