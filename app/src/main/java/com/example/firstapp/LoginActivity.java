package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText mUserEmail;
    private EditText mUserPassword;
    private Button mLoginBtn;
    private String masterPassword = "hello";
    private TextView mSignUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUserEmail = findViewById(R.id.email);
        mUserPassword = findViewById(R.id.password);
        mLoginBtn = findViewById(R.id.loginButton);
        mSignUpText = findViewById(R.id.signUpText);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputEmail = mUserEmail.getEditableText().toString();
                String inputPassword = mUserPassword.getEditableText().toString();

                if (inputEmail.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Correct Credentials", Toast.LENGTH_SHORT).show();
                }else {

                    if (inputPassword.equals(masterPassword)){

                        Toast.makeText(getApplicationContext(), "Password Is Correct", Toast.LENGTH_SHORT).show();
                        Intent firstIntent = new Intent(LoginActivity.this,SecondActivity.class);
                        firstIntent.putExtra("EMAIL",inputEmail);
                        startActivity(firstIntent);

                    }else {

                        Toast.makeText(getApplicationContext(), "Password Is Wrong", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

        mSignUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);

            }
        });

    }
}