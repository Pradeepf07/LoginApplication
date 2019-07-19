package com.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameholder = findViewById(R.id.textView8);
        TextView unameholder = findViewById(R.id.textView15);
        TextView ybirthholder = findViewById(R.id.textView16);
        TextView genderholder = findViewById(R.id.textView17);
        TextView emailholder = findViewById(R.id.textView18);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("userdata", Context.MODE_PRIVATE);
        final String name = pref.getString("name",null);
        final String ybirth = pref.getString("ybirth",null);
        final String gender = pref.getString("gender",null);
        final String email = pref.getString("email",null);


        nameholder.setText("HI "+name);
        unameholder.setText(name+" Is your name");
        ybirthholder.setText(ybirth+" Is your birth year");
        genderholder.setText("You are Gender is "+gender);
        emailholder.setText(email+" Is your Email Address");
    }
}
