package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWortel1 extends AppCompatActivity {
    Button btnBackWortel1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wortel1);
        btnBackWortel1 = (Button) findViewById(R.id.btnFotoWortel);

        btnBackWortel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnWortel = new Intent(ActivityWortel1.this,MainActivity.class);
                startActivity(pindahBtnWortel);
            }
        });
    }
}

