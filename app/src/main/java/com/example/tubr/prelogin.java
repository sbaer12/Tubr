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
        studentB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToStudent();
            }
        });

        Button tutorB = findViewById(R.id.tutor_button);
        tutorB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToTutor();
            }
        });
    }

    public void goToTutor() {
        Intent intent = new Intent(this , tutor_login.class);
        startActivity(intent);
        finish();
    }

    public void goToStudent() {
        Intent intent = new Intent(this, student_login.class);
        startActivity(intent);
        finish();
    }
}
