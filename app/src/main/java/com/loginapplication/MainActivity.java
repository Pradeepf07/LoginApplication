package com.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("userdata", Context.MODE_PRIVATE);
        String loginhint = pref.getString("loginhint",null);

        if(loginhint == null){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        }
        else {
            Toast.makeText(MainActivity.this,loginhint,Toast.LENGTH_LONG).show();
        }
    }
}
