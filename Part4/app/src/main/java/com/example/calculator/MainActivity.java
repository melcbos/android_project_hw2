package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnSqrt;
    private Button btnEqual;
    private Button btnDecimal;
    private Button btnClear;
    private EditText output;
    private float val1, val2;

    boolean Addition, Subtraction, Multiplication, Division, Sqrt;

    double ans = 0; //global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnZero = (Button) findViewById(R.id.btn0);
        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine = (Button) findViewById(R.id.btn9);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnEqual = (Button) findViewById(R.id.btnEqual);


        output = (EditText) findViewById(R.id.output);
        btnAdd = (Button) findViewById((R.id.btnAdd));
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);


        //use view setonclicklistener instead of using android:onClick because that is depreciated
        //The above snippet creates an instance of View.OnClickListener and wires the listener
        // to the button using setOnClickListener(View.OnClickListener).
        // As a result, the system executes the code you write in onClick(View)
        // after the user presses the button.


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");


            }
        });


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("1");
                output.setText(output.getText().toString()+"1");


            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("2");
                output.setText(output.getText().toString()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("3");
                output.setText(output.getText().toString()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("4");
                output.setText(output.getText().toString()+"4");

            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("5");
                output.setText(output.getText().toString()+"5");

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("6");
                output.setText(output.getText().toString()+"6");

            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("7");
                output.setText(output.getText().toString()+"7");

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("8");
                output.setText(output.getText().toString()+"8");

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("9");
                output.setText(output.getText().toString()+"9");

            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checkInput("0");
                output.setText(output.getText().toString()+"0");

            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText().toString() + ".");
            }
        });





        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output == null) {
                    output.setText("");

                }else{
                    val1 = Float.parseFloat(output.getText().toString()+"");
                    Addition = true;
                    output.setText(null);
                }

            }
        });


        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(output == null) {
                    output.setText("");

                }else{
                    val1 = Float.parseFloat(output.getText().toString()+"");
                    Subtraction = true;
                    output.setText(null);
                }

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(output.getText().toString()+"");
                Multiplication = true;
                output.setText(null);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(output.getText().toString()+"");
                Division = true;
                output.setText(null);

            }
        });

        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(output.getText().toString()+"");
                Sqrt = true;
                output.setText(null);

            }
        });



        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Sqrt) {
                        ans = Math.sqrt(val1);
                        output.setText(ans + "");
                        Sqrt = false;
                    }

                else {
                    val2 = Float.parseFloat(output.getText().toString() + "");
                    if (Addition == true) {
                        output.setText(val1 + val2 + "");
                        Addition = false;
                    }

                    if (Subtraction == true) {
                        output.setText(val1 - val2 + "");
                        Subtraction = false;
                    }

                    if (Multiplication == true) {
                        output.setText(val1 * val2 + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        if (val2 == 0) {
                            output.setText("Error");
                            Division = false;
                        } else {

                            output.setText(val1 / val2 + "");
                            Division = false;
                        }

                    }

                }
            }
        });



    }


}