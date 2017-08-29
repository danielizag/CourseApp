package com.example.danielizaguirre.courseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiation
        EditText userET;
        EditText passwordET;
        Button loginBut;
        final TextView responseTV;
        final User myUser = new User();

        // Initialization
        userET = (EditText) findViewById(R.id.usernameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        loginBut = (Button) findViewById(R.id.loginButton);
        responseTV = (TextView) findViewById(R.id.responseTV);

        String user;
        String pass;
        final String response;

        user = userET.getText().toString();
        pass = passwordET.getText().toString();

        myUser.setUsername(user);
        myUser.setPassword(pass);

        response = myUser.responseMessage();

        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responseTV.setText(response);
            }
        });

    }
}
