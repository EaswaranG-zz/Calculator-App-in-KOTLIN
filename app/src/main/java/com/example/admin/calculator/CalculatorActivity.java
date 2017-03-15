package com.example.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {
    float val1=0,val2=0,val3=0;
    Boolean add=false,sub=false,mul=false,div=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        //Find View By ID
        final EditText t1 = (EditText) findViewById(R.id.EditText);
        Button b1 = (Button) findViewById(R.id.button2);
        Button b2 = (Button) findViewById(R.id.button9);
        Button b3 = (Button) findViewById(R.id.button10);
        Button b4 = (Button) findViewById(R.id.button16);
        Button b5 = (Button) findViewById(R.id.button15);
        Button b6 = (Button) findViewById(R.id.button14);
        Button b7 = (Button) findViewById(R.id.button20);
        Button b8 = (Button) findViewById(R.id.button19);
        Button b9 = (Button) findViewById(R.id.button18);
        Button b0 = (Button) findViewById(R.id.button26);
        Button b_p = (Button) findViewById(R.id.button11);
        Button b_mi = (Button) findViewById(R.id.button13);
        Button b_mu = (Button) findViewById(R.id.button17);
        Button b_d = (Button) findViewById(R.id.button24);
        Button b_dot = (Button) findViewById(R.id.button25);
        Button b_e = (Button) findViewById(R.id.button23);
        Button b_clear = (Button) findViewById(R.id.button27);


        //OnClick Listener

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"0");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+".");
            }
        });

        b_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(t1.getText()+"");
                add=true;
                t1.setText(null);

            }
        });

        b_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(t1.getText()+"");
                sub=true;
                t1.setText(null);

            }
        });

        b_mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(t1.getText()+"");
                mul=true;
                t1.setText(null);

            }
        });

        b_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Float.parseFloat(t1.getText()+"");
                div=true;
                t1.setText(null);

            }
        });

        b_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2= Float.parseFloat(t1.getText()+"");

                if(add==true){
                    t1.setText(val1+val2+"");
                    add=false;

                }
                if(sub==true){
                    t1.setText(val1-val2+"");
                    sub=false;


                }
                if(mul==true){
                    t1.setText(val1*val2+"");
                    mul=false;

                }
                if(div==true){
                    if(val2==0){
                        t1.setText("Divide by zero Math error");
                        return;
                    }
                    t1.setText(val1/val2+"");
                    div=false;

                }


            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(null);

            }
        });





    }
}
