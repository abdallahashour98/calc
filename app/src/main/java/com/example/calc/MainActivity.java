package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        TextView tvxres=findViewById(R.id.tvxresult);
        EditText number1 =findViewById(R.id.txt_number1);
        EditText number2 =findViewById(R.id.txt_number2);
        Button btnM=findViewById(R.id.btnM);
        Button btnP=findViewById(R.id.btnp);
        Button btnD=findViewById(R.id.btnD);
        Button btnH=findViewById(R.id.btnH);
    btnM.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (number1.getText().toString().isEmpty())
            {
                number1.setError("enter number ");
                number1.requestFocus();
            }

            else if (number2.getText().toString().isEmpty())
            {
                number2.setError("enter number");
                number2.requestFocus();

            }
            else  {
                double x,y;
                x=Double.parseDouble(number1.getText().toString());
                y=Double.parseDouble(number2.getText().toString());
                double tvxresult =y - x;
                tvxres.setText(String.valueOf(tvxresult));

            }

        }
    });
    btnP.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (number1.getText().toString().isEmpty())
            {
                number1.setError("enter number ");
                number1.requestFocus();
            }

            else if (number2.getText().toString().isEmpty())
            {
                number2.setError("enter number");
                number2.requestFocus();

            }
            else  {
                double x,y;
                x=Double.parseDouble(number1.getText().toString());
                y=Double.parseDouble(number2.getText().toString());
                double tvxresult =y + x;
                tvxres.setText(String.valueOf(tvxresult));

            }

        }
    });
    btnD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (number1.getText().toString().isEmpty())
            {
                number1.setError("enter number ");
                number1.requestFocus();
            }

            else if (number2.getText().toString().isEmpty())
            {
                number2.setError("enter number");
                number2.requestFocus();

            }
            else  {
                double x,y;
                x=Double.parseDouble(number1.getText().toString());
                y=Double.parseDouble(number2.getText().toString());
                double tvxresult =y / x;
                tvxres.setText(String.valueOf(tvxresult));

            }

        }
    });
    btnH.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (number1.getText().toString().isEmpty())
            {
                number1.setError("enter number ");
                number1.requestFocus();
            }

            else if (number2.getText().toString().isEmpty())
            {
                number2.setError("enter number");
                number2.requestFocus();

            }
            else  {
                double x,y;
                x=Double.parseDouble(number1.getText().toString());
                y=Double.parseDouble(number2.getText().toString());
                double tvxresult =y * x;
                tvxres.setText(String.valueOf(tvxresult));
            }

        }
    });








    }
}