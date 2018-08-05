package com.example.abhinandan.bookmysaloon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button signin,signup;
    EditText user,pass;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    signin = findViewById(R.id.signin);
    signup = findViewById(R.id.signup);
    user  = findViewById(R.id.username);
    pass = findViewById(R.id.password);

    user.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String string1 = user.getText().toString();
            if(string1.length() == 0 )
            {
                b = 1;
                user.setError("Enter mobile no");
            }
            else if (string1.length() != 10)
            {
                b = 1;
                user.setError("Please enter valid Numner");
            }
        }
    });

    pass.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            String string2 = pass.getText().toString();
            if(string2.length() == 0 ){
                pass.setError("Enter your password");
            }
            else if(string2.length() <  8 )
            {
                b = 1;
                pass.setError("minimum 8 character required");
            }
        }
    });



    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {Intent i = new Intent(Login.this,Signup.class);
            startActivity(i);
        }
    });
    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if( a == 0 && b == 0)
            {
                Toast.makeText(Login.this, "Fill the correct Details", Toast.LENGTH_SHORT).show();
            }else {
                Intent i = new Intent(Login.this,MainActivity.class);
            startActivity(i);
            }
        }
    });

    }

}
