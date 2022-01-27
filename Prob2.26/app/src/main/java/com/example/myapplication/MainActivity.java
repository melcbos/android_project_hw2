package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkifvalid(View v) {
        EditText email = (EditText) findViewById(R.id.emailAddress);
        String email_string = email.getText().toString();
        TextView label = (TextView) findViewById(R.id.labelvalidationcheck);
        if (email_string.contains("@")){
            label.setText("VALID");
        }
        else{
            label.setText("INVALID");
        }
    }
}