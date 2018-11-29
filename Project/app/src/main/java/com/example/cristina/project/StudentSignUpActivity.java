package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentSignUpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);

    }

    public void navigateToStudentProfile(View v){
        Intent intent = new Intent(this, StudentProfile.class);
        startActivity(intent);
    }

}
