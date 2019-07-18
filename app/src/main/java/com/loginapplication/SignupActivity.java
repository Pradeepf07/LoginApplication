package com.loginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        final EditText name,dob,emailaddress;
        final Spinner gender;
        Button singupbtn;

        name = findViewById(R.id.editText);
        dob = findViewById(R.id.editText5);
        gender = findViewById(R.id.spinner);
        emailaddress = findViewById(R.id.editText6);

        singupbtn = findViewById(R.id.button);

        singupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("")){

                }
                else if (dob.getText().toString().equals(""))
                {

                }
                else if(gender.getSelectedItem().toString().equals("Please select Gender"))
                {

                }
                else if(emailaddress.getText().toString().equals(""))
                {

                }
                else {

                }
            }
        });
    }
}
