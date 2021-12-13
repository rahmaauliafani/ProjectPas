package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgBrokoli,imgPaprika,imgTomat,imgWortel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBrokoli = (CircleImageView) findViewById(R.id.brokolii);
        imgWortel = (CircleImageView) findViewById(R.id.wortell);
        imgPaprika = (CircleImageView) findViewById(R.id.paprikaa);
        imgTomat = (CircleImageView) findViewById(R.id.tomatt);

        imgBrokoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBrokoli = new Intent(MainActivity.this,ActivityBrokoli.class);
                startActivity(pindahBrokoli);
            }
        });
        imgWortel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahWortel = new Intent(MainActivity.this,ActivityWortel.class);
                startActivity(pindahWortel);
            }
        });
        imgPaprika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahPaprika = new Intent(MainActivity.this,ActivityPaprika.class);
                startActivity(pindahPaprika);
            }
        });
        imgTomat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahTomat = new Intent(MainActivity.this,ActivityTomat.class);
                startActivity(pindahTomat);
            }
        });
    }
}