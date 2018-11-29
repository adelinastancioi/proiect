package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class TeacherSignUp extends AppCompatActivity {


    private EditText ed1, ed2, ed3, ed4, ed5, ed6;
    private Button bt1, bt2;
    Switch s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_sign_up);
        ed1 = findViewById(R.id.Prenume);
        ed2 = findViewById(R.id.Nume);
        ed3 = findViewById(R.id.Email);
        ed4 = findViewById(R.id.Password);
        ed5 = findViewById(R.id.Password2);
        ed6 = findViewById(R.id.School);
        bt1 = (Button) findViewById(R.id.loginProf);
        bt2 = (Button) findViewById(R.id.btnJoin);
        s1 = (Switch) findViewById(R.id.Terms);





    }

    public void join(View v) {
        if (ed1 != null && ed2 != null && ed3 != null && ed5 != null && ed6 != null) {
            if ("".equals(ed1.getText().toString()) ||
                    "".equals(ed2.getText().toString()) || "".equals(ed3.getText().toString()) || "".equals(ed4.getText().toString()) || "".equals(ed5.getText().toString()) ||
                    "".equals(ed6.getText().toString())
                    ) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(this);
                builder.setTitle(R.string.error_text);
                builder.setMessage("All fields are mandatory!");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else{
                Intent intent=new Intent(TeacherSignUp.this,TeacherProfileActivity.class);
              startActivity(intent);
            }
        }


    }


    public void logIn(View v)
    {
        Intent intent=new Intent(TeacherSignUp.this,LogInActivity.class);
        startActivity(intent);


    }



}
