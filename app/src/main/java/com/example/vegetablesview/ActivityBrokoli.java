package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBrokoli extends AppCompatActivity {
    Button btnBrokoli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brokoli);
        btnBrokoli =(Button) findViewById(R.id.btnBrokoli);

        btnBrokoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBrokoli = new Intent(ActivityBrokoli.this,ActivityBrokoli1.class);
                startActivity(pindahBrokoli);
            }
        });

    }
}