package com.example.caroline.learningbackendless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private Button login, newAccount;
    private CheckBox showPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void wireWidgets(){
        username = (EditText) findViewById(R.id.username_editText);
        password = (EditText) findViewById(R.id.password_editText);
        login = (Button) findViewById(R.id.login_button);
        newAccount = (Button) findViewById(R.id.new_account_button);
        showPassword = (CheckBox) findViewById(R.id.show_password_checkBox);
    }
}
