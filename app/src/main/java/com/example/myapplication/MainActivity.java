package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

//git is shit
public class MainActivity extends AppCompatActivity {
    private Button resetBtn, deleteBtn;
    private Button num8Btn, num9Btn;
    private Button resetBtn, deleteBtn, num9Btn,num8Btn ;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI elements
        resultTV = findViewById(R.id.resultTV);

        resetBtn = findViewById(R.id.resetBtn);
        deleteBtn = findViewById(R.id.deleteBtn);
        num9Btn = findViewById(R.id.num9Btn);
        num8Btn = findViewById(R.id.num8Btn);

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
    }
}