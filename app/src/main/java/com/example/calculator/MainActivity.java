package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    

    Button button7, button8, button9, button4,button5, button6, button3, button2, button1, button0;
    Button btnc, plusminus, btnd;
    Button btnX, btnplus, btnequal, btnbolu, btnminus;
    TextView tvSan, zapis;

    String birinshiSan, ekinshiSan, znak, zapisText;

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
        btnd = findViewById(R.id.btnd);

        btnX = findViewById(R.id.btnX);
        btnplus = findViewById(R.id.plus);
        btnequal = findViewById(R.id.eaual);
        btnbolu = findViewById(R.id.bolu);
        btnminus = findViewById(R.id.minus);

        tvSan = findViewById(R.id.tvSan);
        zapis = findViewById(R.id.zapis);

        sandarMethods();
        oshiruMethod();
        funcMethod();
    }
    public void sandarMethods(){
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
    }
    public void oshiruMethod(){
        View.OnClickListener buttoncpm = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btnd:
                        String sanText1 = tvSan.getText().toString();
                        int san1 = Integer.parseInt(sanText1);
                        int n = san1/10;
                        tvSan.setText(""+n);
                        break;

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
        btnd.setOnClickListener(buttoncpm);
    }
    public void funcMethod(){
        View.OnClickListener btnFunc = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinshiSan = tvSan.getText().toString();
                switch (view.getId()){
                    case R.id.plus:
                        znak = "+";;
                        break;

                    case R.id.minus:
                        znak = "-";
                        break;

                    case R.id.btnX:
                        znak = "*";
                        break;

                    case R.id.bolu:
                        znak = "/";
                        break;
                }
                zapisText = birinshiSan + znak;
                zapis.setText(zapisText);
                tvSan.setText("0");
            }
        };

        btnplus.setOnClickListener(btnFunc);
        btnminus.setOnClickListener(btnFunc);
        btnX.setOnClickListener(btnFunc);
        btnbolu.setOnClickListener(btnFunc);
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ekinshiSan = tvSan.getText().toString();
                int san1 = Integer.parseInt(birinshiSan);
                int san2 = Integer.parseInt(ekinshiSan);
                int res = 0;
                if (znak.equals("+")){
                    res = san1 + san2;
                }else if (znak.equals("-")){
                    res = san1 - san2;
                }else if (znak.equals("*")){
                    res = san1 * san2;
                }else if (znak.equals("/")){
                    res = san1 / san2;
                }
                zapisText = birinshiSan + znak + ekinshiSan + "=" + res;
                zapis.setText(zapisText);
                tvSan.setText(""+res);
            }
        });

    }

}