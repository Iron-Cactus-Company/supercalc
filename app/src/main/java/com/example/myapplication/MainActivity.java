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
    private Button resetBtn, deleteBtn,percentBtn,dotBtn,plusBtn,minusBtn,divideBtn,multiplyBtn,resultBtn,num7Btn, num8Btn, num9Btn, num6Btn, num5Btn, num4Btn,num3Btn, num2Btn,num1Btn,num0Btn;

    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI elements
        resultTV = findViewById(R.id.resultTV);
        percentBtn=findViewById(R.id.percentBtn);
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

        percentBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            userInput += "%";
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
//check that
        resultBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();
            String [] prenumbers = userInput.split("[-+*/]+");
            String [] preoperators = userInput.split("[0-9]+");

            List<String> numbers = Arrays.asList(prenumbers);
            List<String> operators = Arrays.asList(preoperators);

            System.out.println("----------------------------");
            //System.out.println(values);
            for(String s: numbers){
                System.out.println(s);
            }

            for(String s: operators){
                System.out.println(s);
            }

            int total = Integer.parseInt(numbers.get(0));

            for (int i=1; i<numbers.size(); i++) {
                switch (operators.get(i)) {
                    case "+":
                        total += Integer.parseInt(numbers.get(i));
                        break;
                    case "-":
                        total -= Integer.parseInt(numbers.get(i));
                        break;
                    case "*":
                        total *= Integer.parseInt(numbers.get(i));
                        break;
                    case "/":
                        total /= Integer.parseInt(numbers.get(i));
                        break;
                }
            }
            for (String operator : operators) {
                switch (operator) {

                    case "+":
                        for (int j = 0; j < numbers.size(); j++) {

                            String suka = numbers.get(j) + numbers.get(j + 1);

                            System.out.println(suka);
                            j--;
                        }
                }
            }

            System.out.println("----------------------------");
          // userInput += "9";
            resultTV.setText(userInput);
        });
    }
}