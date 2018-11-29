package com.example.cristina.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    private Button butonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        butonReset = (Button)findViewById(R.id.registerButton);

    }

    public void navigateToResetPassword(View v){
        Intent intent = new Intent(this, ResetPassword.class);
        startActivity(intent);
    }
}
