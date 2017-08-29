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
        final EditText userET;
        final EditText passwordET;
        Button loginBut;
        final TextView responseTV;
        final User myUser = new User();

        // Initialization
        userET = (EditText) findViewById(R.id.usernameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        loginBut = (Button) findViewById(R.id.loginButton);
        responseTV = (TextView) findViewById(R.id.responseTV);

        final String[] user = new String[1];
        final String[] pass = new String[1];
        final String[] response = new String[1];

        user[0] = userET.getText().toString();
        pass[0] = passwordET.getText().toString();

        myUser.setUsername(user[0]);
        myUser.setPassword(pass[0]);

        response[0] = myUser.toString();

        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user[0] = userET.getText().toString();
                pass[0] = passwordET.getText().toString();

                myUser.setUsername(user[0]);
                myUser.setPassword(pass[0]);

                response[0] = myUser.toString();
                responseTV.setText(response[0]);
            }
        });

    }
}
