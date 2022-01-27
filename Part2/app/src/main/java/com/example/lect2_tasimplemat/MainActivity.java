package com.example.lect2_tasimplemat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity{

    private static final String MyFlag = "lfa";  //this will be our trail of breadcrumbs for logging events.

    private Button btnCalculate;
    private EditText edtOp1;
    private EditText edtOp2;
    private TextView txtAnswer;
    private ImageView imgPerson;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MyFlag, "onCreate was just called.");


        //       imgPerson.setImageDrawable();
        imgPerson = (ImageView) findViewById(R.id.imgMonkey);

        //       edtOp1 = new EditText(this);  //incorrect, must find the reference that AS is holding.

        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtAnswer = (TextView) findViewById(R.id.txtAnswer);

        //    edtOp1.setText("Hello World");

        spinner = (Spinner) findViewById(R.id.spinnerOperations);
        // Create an ArrayAdapter using the string array and a default spinner layout

        //ADAPTER: You can use this adapter to provide views for an AdapterView,
        //        Returns a view for each object in a collection of data objects you provide,
        //        and can be used with list-based user interface widgets such as ListView or Spinner

        //The createFromResource() method allows you to create an ArrayAdapter from the string array.
        // The third argument for this method is a layout resource that defines how the selected
        // choice appears in the spinner control. The simple_spinner_item layout is provided
        // by the platform
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.operations, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
                                            Double Op1, Op2, Answer;

                                            @Override
                                            public void onClick(View view) {
                                                String operationSelected = spinner.getSelectedItem().toString();
                                                try {
                                                    Op1 = Double.parseDouble(edtOp1.getText().toString());
                                                    Op2 = Double.parseDouble(edtOp2.getText().toString());
//
                                                    if (operationSelected.equals("Addition")){
                                                        Answer = Op1 + Op2;
                                                        txtAnswer.setText(Answer.toString());
                                                    }
                                                    else if (operationSelected.equals("Subtraction")){
                                                        Answer = Op1 - Op2;
                                                        txtAnswer.setText(Answer.toString());
                                                    }
                                                    else if (operationSelected.equals("Multiplication")){
                                                        Answer = Op1 * Op2;
                                                        txtAnswer.setText(Answer.toString());
                                                    }
                                                    else if (operationSelected.equals("Division") && Op2 != 0){
                                                        Answer = Op1/Op2;
                                                        txtAnswer.setText(Answer.toString());
                                                    }
                                                    else if (operationSelected.equals("Modulus") && Op2 !=0){
                                                        Answer = Op1 % Op2;
                                                        txtAnswer.setText(Answer.toString());
                                                    }
                                                    else{
                                                        txtAnswer.setText("Cannot divide by zero homie!");
                                                    }
                                                } catch (Exception e) {
                                                    txtAnswer.setText("ERROR: Cannot use a non-double");

                                                    Log.e(MyFlag, e.toString());

                                                }
                                            }
                                        }
        );

}


//    public void onClick (View foo){
//        Double Op1, Op2, Answer;
//        try {
//            Op1 = Double.parseDouble(edtOp1.getText().toString());
//            Op2 = Double.parseDouble(edtOp2.getText().toString());
//            Answer = Op1 + Op2;
//            txtAnswer.setText(Answer.toString());
//        } catch (Exception e) {
//            txtAnswer.setText("ERROR");
//            Log.e(MyFlag, e.toString());
//
//        }
//    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MyFlag, "onDestroy was just called." );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MyFlag, "onRestart was just called." );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MyFlag, "onPause was just called." );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MyFlag, "onStop was just called." );
    }


}