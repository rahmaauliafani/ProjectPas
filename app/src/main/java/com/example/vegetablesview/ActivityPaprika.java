package com.example.vegetablesview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPaprika extends AppCompatActivity {
    Button btnPaprika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paprika);
       btnPaprika =(Button) findViewById(R.id.btnPaprika);

       btnPaprika.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent pindahBtnPaprika = new Intent(ActivityPaprika.this,ActivityPaprika1.class);
               startActivity(pindahBtnPaprika);
           }
       });
    }
}