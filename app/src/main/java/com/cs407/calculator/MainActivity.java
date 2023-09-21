package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void add(View view){
        EditText numOne = (EditText)findViewById(R.id.myText1);
        EditText numTwo = (EditText)findViewById(R.id.myText2);
        int a = Integer.parseInt(numOne.getText().toString());
        int b = Integer.parseInt(numTwo.getText().toString());

        int c = a + b;
        goToActivity(Integer.toString(c));
    }

    public void subtract(View view){
        EditText numOne = (EditText)findViewById(R.id.myText1);
        EditText numTwo = (EditText)findViewById(R.id.myText2);
        int a = Integer.parseInt(numOne.getText().toString());
        int b = Integer.parseInt(numTwo.getText().toString());

        int c = a - b;
        goToActivity(Integer.toString(c));
    }

    public void multiply(View view){
        EditText numOne = (EditText)findViewById(R.id.myText1);
        EditText numTwo = (EditText)findViewById(R.id.myText2);
        int a = Integer.parseInt(numOne.getText().toString());
        int b = Integer.parseInt(numTwo.getText().toString());

        int c = a * b;
        goToActivity(Integer.toString(c));
    }

    public void divide(View view){
        EditText numOne = (EditText)findViewById(R.id.myText1);
        EditText numTwo = (EditText)findViewById(R.id.myText2);
        int a = Integer.parseInt(numOne.getText().toString());
        int b = Integer.parseInt(numTwo.getText().toString());
        if(b == 0){
            Toast.makeText(MainActivity.this, "Cannot Divide By 0", Toast.LENGTH_LONG).show();
        } else {
            double c = a / b;
            goToActivity(Double.toString(c));
        }
    }
    public void goToActivity(String s){
        Intent intent = new Intent(this, result.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}