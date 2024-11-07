package com.example.numad24fa_chunlingji;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {
    private EditText result;
    private String cur, res;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSubtract, btnAdd, btnDelete, btnEqual;
    private boolean addition = false; //true = addition, false = distract

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.calc_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.myRecyclerView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        result = (EditText) findViewById(R.id.calculation);
        cur = "";
        res = "";

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnPlus);
        btnSubtract = (Button) findViewById(R.id.btnMinus);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnEqual = (Button) findViewById(R.id.btnEqual);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "0";
                display();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "1";
                display();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "2";
                display();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "3";
                display();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "4";
                display();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "5";
                display();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "6";
                display();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "7";
                display();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "8";
                display();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cur = cur + "9";
                display();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addition = true;
                cur = cur + "+";
                display();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addition = false;
                cur = cur + "-";
                display();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               backspace();
               display();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addition) {
                    String[] tokens = cur.split("\\+");
                    String n1 = tokens[0];
                    String n2 = tokens[1];
                    res = Integer.toString(Integer.parseInt(n1) + Integer.parseInt(n2));
                }
                else {
                    String[] tokens = cur.split("-");
                    String n1 = tokens[0];
                    String n2 = tokens[1];
                    res = Integer.toString(Integer.parseInt(n1) - Integer.parseInt(n2));
                }
                displayResult();
            }
        });
    }

    public void display() {
        result.setText(cur);
    }
    public void displayResult() {
        result.setText(res);
    }

    public void displayTest() {
        result.setText(cur);
    }

    public void backspace() {
        //if cur is not empty, then remove the last char
        if (!cur.isEmpty()) {
            cur = cur.substring(0, cur.length() - 1);
        }
    }




}