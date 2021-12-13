package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTomat extends AppCompatActivity {
    Button btnTomat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomat);
        btnTomat = (Button) findViewById(R.id.btnTomat);

        btnTomat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnTomat = new Intent(ActivityTomat.this,ActivityTomat1.class);
                startActivity(pindahBtnTomat);
            }
        });
    }
}