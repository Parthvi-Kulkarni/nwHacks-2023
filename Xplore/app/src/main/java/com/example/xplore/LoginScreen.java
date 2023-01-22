package com.example.xplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    String username, password;
    EditText usernameInput;
    EditText passwordInput;
    Button buttonLogin;
    Button buttonSignUp;
    Button buttonForgotPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        usernameInput = (EditText)findViewById(R.id.etUsername);
        passwordInput = (EditText)findViewById(R.id.etPassword);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonSignUp = (Button)findViewById(R.id.buttonSignUp);
        buttonForgotPwd = (Button)findViewById(R.id.buttonForgotPwd);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usernameInput.getText().toString();
                password = passwordInput.getText().toString();

                Bundle sendBundle = new Bundle();
                sendBundle.putString("Username", username);
                Intent intent = new Intent(LoginScreen.this, CreateProfile.class);
                intent.putExtras(sendBundle);
                startActivity(intent);
            }
        });

        showToast(username);
        showToast(password);
    }

    private void showToast(String text) {
        Toast.makeText(LoginScreen.this, text, Toast.LENGTH_SHORT).show();

    }


}