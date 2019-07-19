package com.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

        SharedPreferences pref = getApplicationContext().getSharedPreferences("userdata", Context.MODE_PRIVATE);
        final String user = pref.getString("username",null);
        final String pass = pref.getString("password",null);


        bt1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this,"Please enter your username",Toast.LENGTH_LONG).show();
                }
                else if(password.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this,"Please enter your Password",Toast.LENGTH_LONG).show();
                }
                else if(user.equals(username.getText().toString()) && pass.equals(password.getText().toString())) {

                    Toast.makeText(LoginActivity.this,"Valid User",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(LoginActivity.this,"username password was wrong",Toast.LENGTH_LONG).show();
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
