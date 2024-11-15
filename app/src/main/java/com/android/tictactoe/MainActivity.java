package com.android.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

                                      // Set OnClickListener for all buttons
        btn1.setOnClickListener(this::check);
        btn2.setOnClickListener(this::check);
        btn3.setOnClickListener(this::check);
        btn4.setOnClickListener(this::check);
        btn5.setOnClickListener(this::check);
        btn6.setOnClickListener(this::check);
        btn7.setOnClickListener(this::check);
        btn8.setOnClickListener(this::check);
        btn9.setOnClickListener(this::check);
    }

    public void check(View view) {
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

                                 // Check for winner after every move
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

                 // Conditions for winning

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                Toast.makeText(this, "Victory for: " + b1, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                Toast.makeText(this, "Victory for: " + b4, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                Toast.makeText(this, "Victory for: " + b7, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                Toast.makeText(this, "Victory for: " + b1, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                Toast.makeText(this, "Victory for: " + b2, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                Toast.makeText(this, "Victory for: " + b3, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                Toast.makeText(this, "Victory for: " + b1, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                Toast.makeText(this, "Victory for: " + b3, Toast.LENGTH_LONG).show();
                newGameStart();

            } else if (count == 9) {
                Toast.makeText(this, "It's a draw!", Toast.LENGTH_LONG).show();
                newGameStart();
            }
        }
    }

    public void newGameStart() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;
    }
}
