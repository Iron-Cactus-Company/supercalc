package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//git is shit
public class MainActivity extends AppCompatActivity {
    private Button resetBtn, deleteBtn,plusMinusBtn,dotBtn,plusBtn,minusBtn,divideBtn,multiplyBtn,resultBtn,num7Btn, num8Btn, num9Btn, num6Btn, num5Btn, num4Btn,num3Btn, num2Btn,num1Btn,num0Btn;

    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI elements
        resultTV = findViewById(R.id.resultTV);
        plusMinusBtn=findViewById(R.id.plusMinusBtn);
        dotBtn=findViewById(R.id.dotBtn);
        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minusBtn);
        divideBtn=findViewById(R.id.divideBtn);
        multiplyBtn=findViewById(R.id.multiplyBtn);
        resultBtn=findViewById(R.id.resultBtn);
        resetBtn = findViewById(R.id.resetBtn);
        deleteBtn = findViewById(R.id.deleteBtn);
        num9Btn = findViewById(R.id.num9Btn);
        num8Btn = findViewById(R.id.num8Btn);
        num7Btn = findViewById(R.id.num7Btn);
        num6Btn = findViewById(R.id.num6Btn);
        num5Btn = findViewById(R.id.num5Btn);
        num4Btn = findViewById(R.id.num4Btn);
        num3Btn = findViewById(R.id.num3Btn);
        num2Btn = findViewById(R.id.num2Btn);
        num1Btn = findViewById(R.id.num1Btn);
        num0Btn = findViewById(R.id.num0Btn);

        //Events
        resetBtn.setOnClickListener(v -> resultTV.setText("") );

        deleteBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();

            String changedStr = userInput.substring(0, userInput.length()-1);

            resultTV.setText(changedStr);
        });

        plusMinusBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            Double agregate = Double.parseDouble(userInput);
            agregate = agregate* -1;
            String result;
            result = Double.toString(agregate);

            resultTV.setText(result);
        });

        num9Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "9";
            resultTV.setText(userInput);
        });
        num8Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "8";
            resultTV.setText(userInput);
        });
        num7Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "7";
            resultTV.setText(userInput);
        });
        num6Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "6";
            resultTV.setText(userInput);
        });
        num5Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "5";
            resultTV.setText(userInput);
        });
        num4Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "4";
            resultTV.setText(userInput);
        });
        num3Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "3";
            resultTV.setText(userInput);
        });
        num2Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "2";
            resultTV.setText(userInput);
        });
        num1Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "1";
            resultTV.setText(userInput);
        });
        num0Btn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "0";
            resultTV.setText(userInput);
        });


        divideBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "/";
            resultTV.setText(userInput);
        });
        multiplyBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "*";
            resultTV.setText(userInput);
        });

        plusBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "+";
            resultTV.setText(userInput);
        });
        minusBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "-";
            resultTV.setText(userInput);
        });
        dotBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += ".";
            resultTV.setText(userInput);
        });

        resultBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            String [] numbers = userInput.split("[-+*/]+");
            String [] operators = userInput.split("[0-9,.]+");

            for(String s : numbers) System.out.println(s);
            for(String s : operators) System.out.println(s);


            System.out.println("----------------------------");



             double agregate = Double.parseDouble(numbers[0]);
            for(int i=1;i<numbers.length;i++){
                if(operators[i].equals("+"))
                    agregate += Double.parseDouble(numbers[i]);
                else if(operators[i].equals("-"))
                    agregate -= Double.parseDouble(numbers[i]);
                else if(operators[i].equals("*"))
                    agregate *= Double.parseDouble(numbers[i]);
                else if(operators[i].equals("/"))
                    agregate /= Double.parseDouble(numbers[i]);
            }
            System.out.println(agregate);



            System.out.println("----------------------------");
            String result;
            result = Double.toString(agregate);

            resultTV.setText(result);

        });
    }
}