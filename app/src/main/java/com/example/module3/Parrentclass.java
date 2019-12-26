package com.example.module3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Parrentclass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raspisaniepupil);
        Button toOcenki=findViewById(R.id.toOcenki);
        toOcenki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Parrentclass.this, OcenkiClass.class);
                startActivity(i);
                onPause();

            }
        });
    }
}
