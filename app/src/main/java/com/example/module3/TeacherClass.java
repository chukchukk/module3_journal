package com.example.module3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TeacherClass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_lay);
        Button raspisanie=findViewById(R.id.setRaspisnieTeacher);
        Button ocenki=findViewById(R.id.setOcenkiTeacher);
        raspisanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TeacherClass.this, SetHomeWork.class);
                startActivity(i);
                onPause();
            }
        });

        ocenki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(TeacherClass.this, SetOcenki.class);
                startActivity(i);
                onPause();
            }
        });
    }
}
