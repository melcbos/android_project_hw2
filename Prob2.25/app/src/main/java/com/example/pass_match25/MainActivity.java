package com.example.pass_match25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private EditText password1;
    private EditText password2;
    private String pass1;
    private String pass2;
    private TextView labelforexpression;

    public void check(View v) {
        password1 = (EditText) findViewById(R.id.password1);
        password2 = (EditText) findViewById(R.id.password2);
        pass1 = password1.getText().toString();
        pass2 = password2.getText().toString();
        labelforexpression = findViewById((R.id.labelforpass));
        if (pass1.equals(pass2)){
            //update teh View with the expression "THANK YOU"
            labelforexpression.setText("THANK YOU");
        }
        else{
            labelforexpression.setText("PASSWORDS MUST MATCH");

        }


    }
}