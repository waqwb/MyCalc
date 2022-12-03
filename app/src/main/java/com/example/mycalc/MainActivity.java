package com.example.mycalc;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText text_screen, text_result;
    private Button btn_leftBracket, btn_rightBracket, btn_del;
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    private Button btn_doc, btn_calculate, btn_clear, btn_devide, btn_multiply, btn_minus, btn_plus;
    String operator = "";
    double result = 0.0;
    //是否点击=号
    private Boolean isClickCalc = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_screen = (EditText) findViewById(R.id.text_screen);
        text_result = (EditText) findViewById(R.id.text_result);
        btn_leftBracket = (Button) findViewById(R.id.btn_leftBracket);
        btn_rightBracket = (Button) findViewById(R.id.btn_rightBracket);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_doc = (Button) findViewById(R.id.btn_doc);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_devide = (Button) findViewById(R.id.btn_devide);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        initEvent();
    }

    private void initEvent() {
        btn_leftBracket.setOnClickListener(this);
        btn_rightBracket.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_doc.setOnClickListener(this);
        btn_calculate.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_devide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String str = text_screen.getText().toString().trim();
        switch (v.getId()) {
            case R.id.btn_leftBracket:
                break;
            case R.id.btn_rightBracket:
                break;
            case R.id.btn_del:
                str = str.substring(0,str.length()-1);
                text_screen.setText(str);
                break;
            case R.id.btn_1:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"1");
                break;
            case R.id.btn_2:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"2");
                break;
            case R.id.btn_3:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"3");
                break;
            case R.id.btn_4:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"4");
                break;
            case R.id.btn_5:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"5");
                break;
            case R.id.btn_6:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"6");
                break;
            case R.id.btn_7:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"7");
                break;
            case R.id.btn_8:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"8");
                break;
            case R.id.btn_9:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"9");
                break;
            case R.id.btn_0:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+"0");
                break;
            case R.id.btn_doc:
                if (isClickCalc){
                    text_result.setText("");
                    isClickCalc = false;
                }
                text_screen.setText(str+".");
                break;
            case R.id.btn_calculate:
                Log.v("operater",operator);
                String[] strings = str.split(operator);
                //计算
                switch (operator){
                    case "\\+":
                        for (String string:strings) {
                            result += Double.parseDouble(string);
                        }
                        text_result.setText(result + "");
                        text_screen.setText("");
                        result = 0;
                        break;
                    case "-":
                        for (int i = 0; i < strings.length; i++) {
                            if(i==0){
                                result = Double.parseDouble(strings[0]);
                            }else{
                                result -= Double.parseDouble(strings[i]);
                            }
                        }
                        Log.v("result",result+"");
                        text_result.setText(result + "");
                        text_screen.setText("");
                        result = 0;
                        break;
                    case "x":
                        for (int i = 0; i < strings.length; i++) {
                            if(i==0){
                                result = Double.parseDouble(strings[0]);
                            }else{
                                result *= Double.parseDouble(strings[i]);
                            }
                        }
                        Log.v("result",result+"");
                        text_result.setText(result + "");
                        text_screen.setText("");
                        result = 0;
                        break;
                    case "÷":
                        for (int i = 0; i < strings.length; i++) {
                            if(i==0){
                                result = Double.parseDouble(strings[0]);
                            }else{
                                result /= Double.parseDouble(strings[i]);
                            }
                        }
                        text_result.setText(result + "");
                        text_screen.setText("");
                        result = 0;
                        break;
                }
                break;
            case R.id.btn_clear:
                //清空
                text_screen.setText("");
                text_result.setText("");
                break;
            case R.id.btn_devide:
                text_screen.setText(str+"÷");
                operator = "÷";
                break;
            case R.id.btn_multiply:
                text_screen.setText(str+"x");
                operator = "x";
                break;
            case R.id.btn_minus:
                text_screen.setText(str+"-");
                operator = "-";
                break;
            case R.id.btn_plus:
                text_screen.setText(str+"+");
                operator = "\\+";
                break;
        }
    }
}