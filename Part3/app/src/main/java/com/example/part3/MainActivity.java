package com.example.part3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String tag = "partThree";
    /***
     Notice that you call the superclass implementations before you log your messages.
     These superclass calls are required. Calling the superclass implementation before
     you do anything else is critical in onCreate(...);
     the order is less important in the other methods.
    ***/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"onCreate(Bundle) called");
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                EditText editHello = (EditText) findViewById(R.id.editTextTextPersonName);
                TextView tvHello = (TextView) findViewById(R.id.textView);
                editHello.setText("Hello World!");
                tvHello.setText("Hello World!!!");
            }
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "onStart() called");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "onPause() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "onResume() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy() called");
    }

}