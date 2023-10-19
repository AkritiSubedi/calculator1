package com.example.calculator_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstnum = findViewById(R.id.editfirst);
        EditText secondnum = findViewById(R.id.editsecond);

        Button add = findViewById(R.id.btnadd);
        Button sub = findViewById(R.id.btnsub);
        Button mul = findViewById(R.id.btnmul);
        Button div = findViewById(R.id.btndiv);
        TextView result = findViewById(R.id.txtresult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first, second, res;
                first = Float.valueOf(firstnum.getText().toString());
                second = Float.valueOf(secondnum.getText().toString());
                res = first+second;
                String resadd = String.valueOf(res);
                result.setText("Sum = "+resadd);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first, second, res;
                first = Float.valueOf(firstnum.getText().toString());
                second = Float.valueOf(secondnum.getText().toString());
                String ressub = String.valueOf(first-second);
                result.setText("Difference = "+ressub);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first, second, res;
                first = Float.valueOf(firstnum.getText().toString());
                second = Float.valueOf(secondnum.getText().toString());
                String resmul = String.valueOf(first*second);
                result.setText("Product = "+resmul);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first, second;
                first = Float.valueOf(firstnum.getText().toString());
                second = Float.valueOf(secondnum.getText().toString());
                String resdiv = String.valueOf(first/second);
                result.setText("Devident = "+resdiv);
            }
        });

    }
}