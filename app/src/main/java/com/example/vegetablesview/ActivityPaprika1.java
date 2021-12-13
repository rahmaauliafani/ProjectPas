package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPaprika1 extends AppCompatActivity {
    Button btnBackPaprika1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paprika1);
        btnBackPaprika1 = (Button) findViewById(R.id.btn_FotoPap);

        btnBackPaprika1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnFotoPaprika = new Intent(ActivityPaprika1.this,MainActivity.class);
                startActivity(pindahBtnFotoPaprika);
            }
        });
    }
}