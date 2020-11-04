package com.calculator.calculatorapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber1, edtNumber2, edtNumber3;
    String number1, number2, number3, result;
    CheckBox checkFirst, checkSecond, checkThird;
    Button btnPlus, btnMin, btnX, btnPer;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1 = findViewById(R.id.edt_number1);
        edtNumber2 = findViewById(R.id.edt_number2);
        edtNumber3 = findViewById(R.id.edt_number3);
        checkFirst = findViewById(R.id.check_first);
        checkSecond = findViewById(R.id.check_second);
        checkThird = findViewById(R.id.check_third);
        btnPlus = findViewById(R.id.btn_plus);
        btnMin = findViewById(R.id.btn_minus);
        btnX = findViewById(R.id.btn_x);
        btnPer = findViewById(R.id.btn_per);
        tvResult = findViewById(R.id.tv_result);


        btnPlus.setOnClickListener(v -> setPlus());
        btnMin.setOnClickListener(v -> setMinus());
        btnX.setOnClickListener(v -> setCross());
        btnPer.setOnClickListener(v -> setPer());



    }

    private void setPlus() {
        number1 = edtNumber1.getText().toString();
        number2 = edtNumber2.getText().toString();
        number3 = edtNumber3.getText().toString();

        if (number1.isEmpty() && checkFirst.isChecked()) {
            edtNumber1.setError(getString(R.string.empty));
        } else if (number2.isEmpty() && checkSecond.isChecked()) {
            edtNumber2.setError(getString(R.string.empty));
        } else if (number3.isEmpty() && checkThird.isChecked()) {
            edtNumber3.setError(getString(R.string.empty));
        } else {

            if (checkFirst.isChecked() && checkSecond.isChecked() && checkThird.isChecked()) {
                String result = String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number2) + Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkSecond.isChecked()) {
                String result = String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number2));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkThird.isChecked()) {
                String result = String.valueOf(Integer.parseInt(number1) + Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkSecond.isChecked() && checkThird.isChecked()) {
                String result = String.valueOf(Integer.parseInt(number2) + Integer.parseInt(number3));
                tvResult.setText(result);
            } else {
                Toast.makeText(getApplicationContext(), "Minimal di checklist 2 item", Toast.LENGTH_SHORT).show();
            }
    }

    }

    private void setMinus() {
        number1 = edtNumber1.getText().toString();
        number2 = edtNumber2.getText().toString();
        number3 = edtNumber3.getText().toString();

        if (number1.isEmpty() && checkFirst.isChecked()) {
            edtNumber1.setError(getString(R.string.empty));
        } else if (number2.isEmpty() && checkSecond.isChecked()) {
            edtNumber2.setError(getString(R.string.empty));
        } else if (number3.isEmpty() && checkThird.isChecked()) {
            edtNumber3.setError(getString(R.string.empty));
        } else {

            if (checkFirst.isChecked() && checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) - Integer.parseInt(number2) - Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkSecond.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) - Integer.parseInt(number2));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) - Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number2) - Integer.parseInt(number3));
                tvResult.setText(result);
            } else {
                Toast.makeText(getApplicationContext(), "Minimal di checklist 2 item", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void setCross() {
        number1 = edtNumber1.getText().toString();
        number2 = edtNumber2.getText().toString();
        number3 = edtNumber3.getText().toString();

        if (number1.isEmpty() && checkFirst.isChecked()) {
            edtNumber1.setError(getString(R.string.empty));
        } else if (number2.isEmpty() && checkSecond.isChecked()) {
            edtNumber2.setError(getString(R.string.empty));
        } else if (number3.isEmpty() && checkThird.isChecked()) {
            edtNumber3.setError(getString(R.string.empty));
        } else {

            if (checkFirst.isChecked() && checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number2) * Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkSecond.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number2));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number1) * Integer.parseInt(number3));
                tvResult.setText(result);
            } else if (checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Integer.parseInt(number2) * Integer.parseInt(number3));
                tvResult.setText(result);
            } else {
                Toast.makeText(getApplicationContext(), "Minimal di checklist 2 item", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private void setPer() {
        number1 = edtNumber1.getText().toString();
        number2 = edtNumber2.getText().toString();
        number3 = edtNumber3.getText().toString();

        if (number1.isEmpty() && checkFirst.isChecked()) {
            edtNumber1.setError(getString(R.string.empty));
        } else if (number2.isEmpty() && checkSecond.isChecked()) {
            edtNumber2.setError(getString(R.string.empty));
        } else if (number3.isEmpty() && checkThird.isChecked()) {
            edtNumber3.setError(getString(R.string.empty));
        } else {

            if (checkFirst.isChecked() && checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Double.parseDouble(number1) / Double.parseDouble(number2) / Double.parseDouble(number3));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkSecond.isChecked()) {
                result = String.valueOf(Double.parseDouble(number1) / Double.parseDouble(number2));
                tvResult.setText(result);
            } else if (checkFirst.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Double.parseDouble(number1) / Double.parseDouble(number3));
                tvResult.setText(result);
            } else if (checkSecond.isChecked() && checkThird.isChecked()) {
                result = String.valueOf(Double.parseDouble(number2) / Double.parseDouble(number3));
                tvResult.setText(result);
            } else {
                Toast.makeText(getApplicationContext(), "Minimal di checklist 2 item", Toast.LENGTH_SHORT).show();
            }
        }

    }
}