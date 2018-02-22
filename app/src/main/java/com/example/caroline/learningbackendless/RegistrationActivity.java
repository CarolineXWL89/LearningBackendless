package com.example.caroline.learningbackendless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    private EditText username, initialPassword, confirmPassword, firstName, lastName, emailAddress;
    Button register;
    /*
    Fields: UserName, Password, Confirm Password, First Name, Last Name, Email Address
    Button: Register
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        wireWidgets();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void wireWidgets(){
        username = (EditText) findViewById(R.id.username_editText);
        initialPassword = (EditText) findViewById(R.id.password_initial_editText);
        confirmPassword = (EditText) findViewById(R.id.password_confirm_editText);
        firstName = (EditText) findViewById(R.id.first_name_editText);
        lastName = (EditText) findViewById(R.id.last_name_editText);
        emailAddress = (EditText) findViewById(R.id.email_editText);
        register = (Button) findViewById(R.id.register_button);
    }
}
