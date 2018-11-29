package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TeacherOrStudent extends AppCompatActivity {
    private  ImageButton teacher,student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_or_student);
        teacher=(ImageButton)findViewById(R.id.profBtn);
        student=(ImageButton)findViewById(R.id.studentBtn);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),SelectSignActivity.class);
                intent.putExtra("USER","teacher");
                setResult(RESULT_OK, intent);
                finish();
                startActivity(intent);
            }
        });


        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), SelectSignActivity.class);
                intent.putExtra("USER","student");
                setResult(RESULT_OK, intent);
                finish();
                startActivity(intent);
            }
        });
    }
}
