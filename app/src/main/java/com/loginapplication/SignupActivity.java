package com.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        final EditText name,dob,emailaddress;
        final Spinner gender;
        ImageView backarrow;
        Button singupbtn;

        backarrow = findViewById(R.id.imageView3);
        name = findViewById(R.id.editText);
        dob = findViewById(R.id.editText5);
        gender = findViewById(R.id.spinner);
        emailaddress = findViewById(R.id.editText6);

        singupbtn = findViewById(R.id.button);

        singupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("")){
                    Toast.makeText(SignupActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else if (dob.getText().toString().equals(""))
                {
                    Toast.makeText(SignupActivity.this, "Please enter your Birth Year", Toast.LENGTH_SHORT).show();
                }
                else if(gender.getSelectedItem().toString().equals("Please select Gender"))
                {
                    Toast.makeText(SignupActivity.this, "Please select your gender", Toast.LENGTH_SHORT).show();
                }
                else if(emailaddress.getText().toString().equals(""))
                {
                    Toast.makeText(SignupActivity.this, "Please enter your email address", Toast.LENGTH_SHORT).show();
                }
                else {
                    SharedPreferences pref = getApplicationContext().getSharedPreferences("userdata", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();

                    editor.putString("name",name.getText().toString());
                    editor.putString("ybirth",dob.getText().toString());
                    editor.putString("gender",gender.getSelectedItem().toString());
                    editor.putString("email",emailaddress.getText().toString());

                    String username  = name.getText().toString().substring(0,1)+dob.getText().toString();
                    String pass = dob.getText().toString();

                    Toast.makeText(SignupActivity.this,"Username : "+username+"\nPassword : "+pass,Toast.LENGTH_LONG).show();
                    editor.putString("username",username);
                    editor.putString("password",pass);


                    editor.commit();

                    startActivity(new Intent(SignupActivity.this,LoginActivity.class));
                }
            }
        });

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(SignupActivity.this,LoginActivity.class));
            }
        });
    }
}
