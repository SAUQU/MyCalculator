package com.example.segundoauqui.mycalculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String stR;

    private double a,b;
    private boolean add, sub, mul, div;


    public static final String TAG = "Activity";

    Button number1;
    Button number2;
    Button number3;
    Button number4;
    Button number5;
    Button number6;
    Button number7;
    Button number8;
    Button number9;
    Button number0;
    Button numberS;
    Button numberR;
    Button numberD;
    Button numberM;
    Button numberAC;
    Button numberE;
    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        tvName = (TextView)findViewById(R.id.tvName);
        stR = "";


        number1 = (Button) findViewById(R.id.number1);
        number2 = (Button) findViewById(R.id.number2);
        number3 = (Button) findViewById(R.id.number3);
        number4 = (Button) findViewById(R.id.number4);
        number5 = (Button) findViewById(R.id.number5);
        number6 = (Button) findViewById(R.id.number6);
        number7 = (Button) findViewById(R.id.number7);
        number8 = (Button) findViewById(R.id.number8);
        number9 = (Button) findViewById(R.id.number9);
        number0 = (Button) findViewById(R.id.number0);
        numberS = (Button) findViewById(R.id.numberS);
        numberR = (Button) findViewById(R.id.numberR);
        numberD = (Button) findViewById(R.id.numberD);
        numberM = (Button) findViewById(R.id.numberM);
        numberAC = (Button) findViewById(R.id.numberAC);
        numberE = (Button) findViewById(R.id.numberE);

        tvName = (TextView) findViewById(R.id.tvName);

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "0");
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText(tvName.getText() + "9");
            }
        });

        numberS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tvName.getText() + "");
                add = true;
                tvName.setText(null);

            }
        });

        numberR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tvName.getText() + "");
                sub = true;
                tvName.setText(null);
            }
        });

        numberM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tvName.getText() + "");
                mul = true;
                tvName.setText(null);
            }
        });

        numberD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tvName.getText() + "");
                div = true;
                tvName.setText(null);
            }
        });

        numberAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText("");
            }
        });

        numberE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Double.parseDouble(tvName.getText() + "");
                if(add==true){
                    tvName.setText(a+b+"");
                    add=false;
                }

                if(sub==true){
                    tvName.setText(a-b+"");
                    sub=false;
                }

                if(mul==true){
                    tvName.setText(a*b+"");
                    mul=false;
                }

                if(div==true){
                    tvName.setText(a/b+"");
                    div=false;
                }

            }

        });

        Log.d(TAG, "onCreate: ");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, "onPause: ");
        ;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


    }
