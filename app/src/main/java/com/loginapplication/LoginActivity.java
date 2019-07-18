package com.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username,password;
        TextView signupclick ;
        Button bt1;

        username = findViewById(R.id.editText3);
        password = findViewById(R.id.editText4);
        signupclick = findViewById(R.id.textView4);
        bt1 = findViewById(R.id.button2);

        bt1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this,"Please enter your username",Toast.LENGTH_LONG).show();
                }
                else if(password.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this,"Please enter your Password",Toast.LENGTH_LONG).show();
                }
                else if (username.getText().toString().equals("123") && password.getText().toString().equals("456")){
                    Toast.makeText(LoginActivity.this,"Valid User",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(LoginActivity.this,"In valid User",Toast.LENGTH_LONG).show();
                }
            }
        });


        signupclick.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });
    }
}
