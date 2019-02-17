package com.example.tubr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class student_login extends AppCompatActivity {

    public final String S_NAME = "";
    public final String S_CLASS = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
    }

    public void student_classes(View view){
        Intent intent = new Intent(this, ClassesList.class);
        EditText tutor_name = (EditText) findViewById(R.id.editText4);
        String message = tutor_name.getText().toString();
        intent.putExtra(S_NAME,message);
        EditText classes = (EditText) findViewById(R.id.editText5);
        String message2 = classes.getText().toString();
        intent.putExtra(S_CLASS,message2);
        startActivity(intent);
    }
}
