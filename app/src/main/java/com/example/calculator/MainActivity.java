package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    

    Button button7, button8, button9, button4,button5, button6, button3, button2, button1, button0;
    Button btnc, plusminus;
    TextView tvSan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button3 = findViewById(R.id.btn3);
        button2 = findViewById(R.id.btn2);
        button1 = findViewById(R.id.btn1);
        button0 = findViewById(R.id.btn0);

        btnc = findViewById(R.id.btnc);
        plusminus = findViewById(R.id.plusminus);
        tvSan = findViewById(R.id.tvSan);

        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldyngySan = tvSan.getText().toString();
                String songyResult = "";
                String basylganSan  = "";
                switch (view.getId()) {
                    case R.id.btn0:
                        basylganSan = "0";
                        break;

                    case R.id.btn1:
                        basylganSan = "1";
                        break;

                    case R.id.btn2:
                        basylganSan = "2";
                        break;

                    case R.id.btn3:
                        basylganSan = "3";
                        break;

                    case R.id.btn4:
                        basylganSan = "4";
                        break;

                    case R.id.btn5:
                        basylganSan = "5";
                        break;

                    case R.id.btn6:
                        basylganSan = "6";
                        break;

                    case R.id.btn7:
                        basylganSan = "7";
                        break;

                    case R.id.btn8:
                        basylganSan = "8";
                        break;

                    case R.id.btn9:
                        basylganSan = "9";
                        break;
                }
                if(!aldyngySan.equals("0")) songyResult = aldyngySan + basylganSan;
                else songyResult = basylganSan;
                tvSan.setText(songyResult);
            }
        };

        button0.setOnClickListener(buttonSandar);
        button1.setOnClickListener(buttonSandar);
        button2.setOnClickListener(buttonSandar);
        button3.setOnClickListener(buttonSandar);
        button4.setOnClickListener(buttonSandar);
        button5.setOnClickListener(buttonSandar);
        button6.setOnClickListener(buttonSandar);
        button7.setOnClickListener(buttonSandar);
        button8.setOnClickListener(buttonSandar);
        button9.setOnClickListener(buttonSandar);

        View.OnClickListener buttoncpm = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnc:
                        tvSan.setText("0");
                        break;

                    case R.id.plusminus:
                        String sanText = tvSan.getText().toString();

                        int san = Integer.parseInt(sanText);
                        if (san > 0) tvSan.setText("-" + sanText);
                        else {
                            san = san * (-1);
                            tvSan.setText(""+san);
                        }
                            break;
                }
            }
        };
        plusminus.setOnClickListener(buttoncpm);
        btnc.setOnClickListener(buttoncpm);
    }
}