package com.example.tubr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tutor_login extends AppCompatActivity {

    public final String TUTOR_NAME = "";
    public final String TUTOR_CLASS = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_login);


    }

    public void go_to_classes(View view){
        Intent intent = new Intent(this, ClassesList.class);
        EditText tutor_name = (EditText) findViewById(R.id.editText7);
        String message = tutor_name.getText().toString();
        intent.putExtra(TUTOR_NAME,message);
        EditText classes = (EditText) findViewById(R.id.editText8);
        String message2 = classes.getText().toString();
        intent.putExtra(TUTOR_CLASS,message2);
        startActivity(intent);
    }
}
