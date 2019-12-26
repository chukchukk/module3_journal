package com.example.module3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubjectsPupil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisaniepupil);
        Button ocenki=findViewById(R.id.toOcenki);

      ocenki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SubjectsPupil.this, OcenkiClass.class);
                startActivity(i);
                onPause();
            }
        });
    }
}
