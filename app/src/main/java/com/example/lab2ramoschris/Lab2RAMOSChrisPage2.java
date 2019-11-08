package com.example.lab2ramoschris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Lab2RAMOSChrisPage2 extends AppCompatActivity {

    EditText checkCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_ramoschris_page2);
        checkCourse = findViewById(R.id.editText8);
    }

    public void goBack(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void doCheck (View v) {
        SharedPreferences sp = getSharedPreferences("my course", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String c1 = sp.getString("Course", null);
        String c2 = sp.getString("Course", null);
        String c3 = sp.getString("Course", null);
        String c4 = sp.getString("Course", null);
        String c5 = sp.getString("Course", null);
        String c6 = sp.getString("Course", null);
        String c7 = sp.getString("Course", null);
        String c8 = sp.getString("Course", null);

        if (c1.equals(c1) || c2.equals(c2) || c3.equals(c3) || c4.equals(c4) || c5.equals(c5) ||
                c6.equals(c6) || c7.equals(c7) || c8.equals(c8)) {
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Course is not offered in UST", Toast.LENGTH_LONG).show();
        }
    }
}