package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button resetBtn, deleteBtn;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI elements
        resultTV = findViewById(R.id.resultTV);

        resetBtn = findViewById(R.id.resetBtn);
        deleteBtn = findViewById(R.id.deleteBtn);

        //Events
        resetBtn.setOnClickListener(v -> resultTV.setText("") );

        deleteBtn.setOnClickListener(v -> {
            String userInput = resultTV.getText().toString();

            String changedStr = userInput.substring(0, userInput.length()-1);

            resultTV.setText(changedStr);
        });
    }
}