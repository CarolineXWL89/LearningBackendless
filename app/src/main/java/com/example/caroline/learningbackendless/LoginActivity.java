package com.example.caroline.learningbackendless;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    private Button login, newAccount;
    private CheckBox showPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        wireWidgets();

        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Will you please make me some toast?", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void wireWidgets(){
        username = (EditText) findViewById(R.id.username_editText);
        password = (EditText) findViewById(R.id.password_editText);
        login = (Button) findViewById(R.id.login_button);
        newAccount = (Button) findViewById(R.id.new_account_button);
        showPassword = (CheckBox) findViewById(R.id.show_password_checkBox);
    }

}
