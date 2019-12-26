package com.example.module3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class logining extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logining_layout);
        final String[] teacherArr=new String[2];
        final String[] adminArr=new String[2];
        final String[] pupilArr=new String[2];
        final String[] zavuchArr=new String[2];
        final String[] directorArr=new String[2];
        final String[] parrentArr=new String[2];
        final EditText login=findViewById(R.id.editlogin);
        final EditText password=findViewById(R.id.editpassword);
        Button exit=findViewById(R.id.mainExit);

        parrentArr[0]="nicolay";
        parrentArr[1]="kuzin";
        teacherArr[0]="denis";
        teacherArr[1]="ponomarev";
        adminArr[0]="admin";
        adminArr[1]="admin";
        pupilArr[0]="pupil";
        pupilArr[1]="green";
        zavuchArr[0]="zavuch";
        zavuchArr[1]="zavuch";
        directorArr[0]="director";
        directorArr[1]="director";
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(login.getText().toString().equals(teacherArr[0]) &&
                       password.getText().toString().equals(teacherArr[1]) ){
                    Intent i=new Intent(logining.this,TeacherClass.class);
                    startActivity(i);
                    onPause();
                }

                if(login.getText().toString().equals(adminArr[0]) &&
                        password.getText().toString().equals(adminArr[1]) ){
                    Intent i=new Intent(logining.this,Adminclass.class);
                    startActivity(i);
                    onPause();
                }

                if(login.getText().toString().equals(pupilArr[0]) &&
                        password.getText().toString().equals(pupilArr[1]) ){
                    Intent i=new Intent(logining.this,SubjectsPupil.class);
                    startActivity(i);
                    onPause();
                }


            /*    if(login.getText().toString().equals(directorArr[0]) &&
                        password.getText().toString().equals(directorArr[1]) ){
                    Intent i=new Intent(logining.this,Directorclass.class);
                    startActivity(i);
                    onPause();
                }*/

                if(login.getText().toString().equals(parrentArr[0]) &&
                        password.getText().toString().equals(parrentArr[1]) ){
                    Intent i=new Intent(logining.this,Parrentclass.class);
                    startActivity(i);
                    onPause();
                }
            }
        });
        }

}
