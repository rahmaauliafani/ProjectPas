package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBrokoli1 extends AppCompatActivity {
    Button btnBackBrokoli1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brokoli1);
        btnBackBrokoli1 = (Button) findViewById(R.id.btnFotoBrokoli);

        btnBackBrokoli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoBrokoli = new Intent(ActivityBrokoli1.this,MainActivity.class);
                startActivity(pindahBtnFotoBrokoli);
            }
        });

    }
}