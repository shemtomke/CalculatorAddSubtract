package com.example.classandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView results;
    EditText value1, value2;
    Button addBtn, subBtn;

    //values to display
    int sub, sum, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        addBtn = (Button) findViewById(R.id.AddButton);
        subBtn = (Button) findViewById(R.id.SubButton);

        //result text
        results = (TextView) findViewById(R.id.resultsText);
        results.setText("");

        //input number
        value1 = (EditText) findViewById(R.id.value1);
        value2 = (EditText) findViewById(R.id.value2);

        Addition();
        Subtraction();
    }

    //sum of two numbers
    int Sum(int num1, int num2)
    {
        sum = num1 + num2;

        return sum;
    }

    //subtract two numbers
    int Sub(int num1, int num2)
    {
        sub = num1 - num2;

        return sub;
    }

    //onclick sum/Add display the values
    public  void Addition()
    {
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                try
                {
                    //convert the string to int values
                    num1 = Integer.parseInt(value1.getText().toString());
                    num2 = Integer.parseInt(value2.getText().toString());

                    //display sum
                    Sum(num1, num2);

                    //display results
                    results.setText("RESULTS : " + sum);
                }
                catch (Exception e)
                {
                    //display an error
                    results.setText("Invalid!");
                }
            }
        });
    }
    public void Subtraction()
    {
        subBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                try
                {
                    //convert the string to int values
                    num1 = Integer.parseInt(value1.getText().toString());
                    num2 = Integer.parseInt(value2.getText().toString());

                    //display sub
                    Sub(num1, num2);

                    //results
                    results.setText("RESULTS : " + sub);
                }
                catch (Exception e)
                {
                    //display an error
                    results.setText("Invalid!");
                }
            }
        });
    }
}