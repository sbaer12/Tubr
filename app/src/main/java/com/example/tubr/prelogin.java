package com.example.tubr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class prelogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelogin);

        Button studentB = findViewById(R.id.student_button);


        Button tutorB = findViewById(R.id.tutor_button);

    }

    public void goToTutor(View view) {
        Intent intent = new Intent(this , tutor_login.class);
        startActivity(intent);

    }

    public void goToStudent(View view) {
        Intent intent = new Intent(this, student_login.class);
        startActivity(intent);

    }
}
