package com.example.module3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button teacher=findViewById(R.id.teacherexit);
        Button admin=findViewById(R.id.adminexit);
        Button pupil=findViewById(R.id.pupilexit);
        Button director=findViewById(R.id.directorexit);
      //  Button zavuch=findViewById(R.id.zavuchexit);
        Button parrent=findViewById(R.id.parrentexit);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,logining.class);
                startActivity(i);
               onPause();
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,logining.class);
                startActivity(i);
                onPause();
            }
        });
        pupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,logining.class);
                startActivity(i);
                onPause();
            }
        });
        director.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,logining.class);
                startActivity(i);
                onPause();
            }
        });
       /* zavuch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,logining.class);
                startActivity(i);
                onPause();
            }
        });*/
        parrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, logining.class);
                startActivity(i);
                onPause();
            }
        });
    }
}
