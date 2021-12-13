package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWortel extends AppCompatActivity {
    Button btnWortel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wortel);
        btnWortel = (Button) findViewById(R.id.btnWortel);

        btnWortel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnWortel = new Intent(ActivityWortel.this,ActivityWortel1.class);
                startActivity(pindahBtnWortel);
            }
        });
    }
}