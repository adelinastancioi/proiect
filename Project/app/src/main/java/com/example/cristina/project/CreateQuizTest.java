package com.example.cristina.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class CreateQuizTest extends AppCompatActivity {
    private Button btCancel,btDone,addQuestion;
    private EditText ed1,ed2,ed3;
    private Switch sw;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quiz_test);

        SharedPreferences sp=getApplication().getSharedPreferences("option",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("key","individual");
        editor.putString("key1","group");

        ed1=findViewById(R.id.Cod);
        ed2=findViewById(R.id.Title);
        ed3=findViewById(R.id.Description);

    }



    public void setBtCancel(View view){
        Intent intent=new Intent(this,TeacherProfileActivity.class);
        startActivity(intent);
    }

    public void setDone(View view){
        //save in bd the test
    }
    public void addQuestion(View view){

        if(ed1!=null && ed2!=null && ed3!=null){
            if("".equals(ed1.getText().toString()) || "".equals(ed2.getText().toString()) || "".equals(ed3.getText().toString())){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Error");
                builder.setPositiveButton("OK",null);
                builder.setMessage("All fields are mandatory");
                AlertDialog dialog=builder.create();
                dialog.show();
            }
            else
            {
                Intent intent=new Intent(this,AddQuestionActivity.class);
                startActivity(intent);
            }
        }

    }
}
