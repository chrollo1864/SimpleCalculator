package com.example.BiscoCalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button minus;
    private Button multiply;
    private Button Divide;
    private Button clear;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1 =(EditText) findViewById(R.id.editTextNumber);
        num2 =(EditText) findViewById(R.id.editTextNumber2);
        add =(Button) findViewById(R.id.button);
        minus =(Button) findViewById(R.id.button2);
        multiply =(Button) findViewById(R.id.button3);
        Divide =(Button) findViewById(R.id.button4);
        clear =(Button) findViewById(R.id.button5);
        answer =(TextView) findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Text = num1.getText().toString();
                String num2Text = num2.getText().toString();

                if (num1Text.isEmpty() || num2Text.isEmpty()){
                    return;
                }
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                answer.setText("The answer is:" +String.valueOf(sum));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Text = num1.getText().toString();
                String num2Text = num2.getText().toString();

                if (num1Text.isEmpty() || num2Text.isEmpty()){
                    return;
                }
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double difference = number1 - number2;
                answer.setText("The answer is:" +String.valueOf(difference));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Text = num1.getText().toString();
                String num2Text = num2.getText().toString();

                if (num1Text.isEmpty() || num2Text.isEmpty()){
                    return;
                }
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double product = number1 * number2;
                answer.setText("The answer is:" +String.valueOf(product));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Text = num1.getText().toString();
                String num2Text = num2.getText().toString();

                if (num1Text.isEmpty() || num2Text.isEmpty()){
                    return;
                }
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());

                if (number1 == 0 || number2 == 0){
                    answer.setText("Syntax Error");
                }else {
                    double quotient = number1 / number2;
                    answer.setText("The answer is:" + String.valueOf(quotient));
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                answer.setText("Answer");
            }
        });
     }
}


