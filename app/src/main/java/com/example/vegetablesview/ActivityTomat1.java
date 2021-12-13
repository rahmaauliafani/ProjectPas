package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTomat1 extends AppCompatActivity {
    Button btnBackTomat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomat1);
        btnBackTomat1=(Button) findViewById(R.id.btnFotoTomat);

        btnBackTomat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnTomat = new Intent(ActivityTomat1.this,MainActivity.class);
                startActivity(pindahBtnTomat);
            }
        });
    }
}