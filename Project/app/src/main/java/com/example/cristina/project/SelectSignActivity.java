package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectSignActivity extends AppCompatActivity {
    private Button btnLogin, btnRegister;
    private static String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sign);

        btnLogin = (Button)findViewById(R.id.loginButton);
        btnRegister = (Button)findViewById(R.id.registerButton);

//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            user = extras.getString("USER");
//        }


    }


    public void navigateToLogInActivity(View v){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }


    public void navigateToSignUp(View v) {
        Intent intent = new Intent(this, TeacherSignUp.class);
        startActivity(intent);
    }

    public void navigateToSignUpStudent(View v){
        Intent intent = new Intent(this, StudentSignUpActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1 && resultCode == RESULT_OK) {

             if(this.user == "teacher") {
                Intent intent = new Intent(this, TeacherSignUp.class);
                startActivity(intent);
            }
            else
            if(this.user == "student"){
                Intent intent = new Intent(this, StudentSignUpActivity.class);
                startActivity(intent);
            }
        }
    }


//    public void navigateToSignUp(View v){
//        Intent intent = new Intent(this,TeacherSignUp.class);
//        startActivity(intent);
//    }
}
