package com.example.a2021_05_26_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText editTextNum1;
    public EditText editTextNum2;
    public TextView textViewResult;
    public RadioGroup radioGroup;
    public RadioButton radioButtonAdd;
    public RadioButton radioButtonSubtract;
    public RadioButton radioButtonMultiply;
    public RadioButton radioButtonDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        textViewResult = findViewById(R.id.textViewResult);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonAdd = findViewById(R.id.radioButtonAdd);
        radioButtonSubtract = findViewById(R.id.radioButtonSubtract);
        radioButtonMultiply = findViewById(R.id.radioButtonMultiply);
        radioButtonDivide = findViewById(R.id.radioButtonDivide);
    }

    public void calculate(View view) {

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double result;
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id) {

            case R.id.radioButtonAdd: {
                result = num1 + num2;
//                Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
                textViewResult.setText("Result: " + result);
                break;
            }

            case R.id.radioButtonSubtract: {
                result = num1 - num2;
//                Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
                textViewResult.setText("Result: " + result);
                break;
            }

            case R.id.radioButtonMultiply: {
                result = num1 * num2;
//                Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
                textViewResult.setText("Result: " + result);
                break;
            }

            case R.id.radioButtonDivide: {
                result = (double) (num1 / num2);
//                Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
                textViewResult.setText("Result: " + result);
                break;
            }

        }

    }


    public void closeMe(View view) {
        Toast.makeText(this, "Have a nice one :)", Toast.LENGTH_SHORT).show();
        finish();
    }
}