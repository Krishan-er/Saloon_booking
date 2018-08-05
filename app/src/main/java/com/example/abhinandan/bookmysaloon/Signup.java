package com.example.abhinandan.bookmysaloon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    Button signup;
    Toolbar signup_toolbar;

    String stringspinner[] = {"Delhi","Noida sector-15", " New Ashok Nagar", "Noida sector-2"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup_toolbar = findViewById(R.id.signup_toolbar);
        setSupportActionBar(signup_toolbar);
        getSupportActionBar().setTitle("SignUp");

        signup = findViewById(R.id.submit);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this,MainActivity.class);
            }
        });

        ArrayAdapter<String>  adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,stringspinner);
        spinner = findViewById(R.id.spin);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Signup.this, "You selected "+ stringspinner[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
