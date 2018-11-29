package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResetPassword extends AppCompatActivity {
    private EditText ed;
    private Button btSign,submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        ed=(EditText)findViewById(R.id.emailEdit);
        btSign=(Button)findViewById(R.id.signUp);
        submit=(Button)findViewById(R.id.btnOKSubmit);

    }



    public void navigateToSignUp(View v){
        Intent intent=new Intent(this,TeacherSignUp.class);
        startActivity(intent);
    }

    public void submit(View v){

    }
}
