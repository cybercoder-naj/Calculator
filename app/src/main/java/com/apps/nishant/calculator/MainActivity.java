package com.apps.nishant.calculator;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView_result;
    private Button buttonC, buttonPlusMinus, buttonMod, buttonDiv,
            button7, button8, button9, buttonMul,
            button4, button5, button6, buttonSub,
            button1, button2, button3, buttonAdd,
            button0, buttonBack, buttonDot, buttonEqual;

    double num1, num2;
    String operator = "";
    boolean nextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) throws NullPointerException{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        actionBar.hide();
        initializeVariables();
        OnButtonClickListener();
    }

    private void initializeVariables() {
        textView_result = (TextView)findViewById(R.id.txtResult);

        buttonC = (Button)findViewById(R.id.cmdC);
        buttonPlusMinus = (Button)findViewById(R.id.cmdMinusPlus);
        buttonMod = (Button)findViewById(R.id.cmdMod);
        buttonDiv = (Button)findViewById(R.id.cmdDiv);
        button7 = (Button)findViewById(R.id.cmd7);
        button8 = (Button)findViewById(R.id.cmd8);
        button9 = (Button)findViewById(R.id.cmd9);
        buttonMul = (Button)findViewById(R.id.cmdMul);
        button4 = (Button)findViewById(R.id.cmd4);
        button5 = (Button)findViewById(R.id.cmd5);
        button6 = (Button)findViewById(R.id.cmd6);
        buttonSub = (Button)findViewById(R.id.cmdSuh);
        button1 = (Button)findViewById(R.id.cmd1);
        button2 = (Button)findViewById(R.id.cmd2);
        button3 = (Button)findViewById(R.id.cmd3);
        buttonAdd = (Button)findViewById(R.id.cmdAdd);
        button0 = (Button)findViewById(R.id.cmd0);
        buttonBack = (Button)findViewById(R.id.cmdBack);
        buttonDot = (Button)findViewById(R.id.cmdDot);
        buttonEqual = (Button)findViewById(R.id.cmdEqual);
    }

    private void OnButtonClickListener() {
        textView_result.setText("");

        buttonC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView_result.setText("");
                        operator = "";
                        nextNumber=true;
                    }
                }
        );

        buttonPlusMinus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")){
                            textView_result.setText("Error: No number Inputted");
                            nextNumber=true;
                        }
                        else {
                            String temp1 = textView_result.getText().toString();
                            char temp = temp1.charAt(0);
                            if(temp == '-') {
                                StringBuilder sb = new StringBuilder(textView_result.getText().toString());
                                sb = sb.deleteCharAt(0);
                                textView_result.setText(sb.toString());
                            }
                            else {
                                temp1 = "-" + temp1;
                                textView_result.setText(temp1);
                            }
                        }
                    }
                }
        );

        buttonMod.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: No number inputted");
                            nextNumber=true;
                        }
                        else {
                            num1 = Double.parseDouble(textView_result.getText().toString());
                            operator = "MOD";
                            nextNumber=true;
                        }
                    }
                }
        );

        buttonDiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: No number inputted");
                        }
                        else {
                            num1 = Double.parseDouble(textView_result.getText().toString());
                            operator = "DIV";
                            nextNumber=true;
                        }
                    }
                }
        );

        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("7");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "7";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("8");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "8";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("9");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "9";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        buttonMul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: No number inputted");
                        }
                        else {
                            num1 = Double.parseDouble(textView_result.getText().toString());
                            operator = "MUL";
                            nextNumber=true;
                        }
                    }
                }
        );

        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("4");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "4";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("5");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "5";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("6");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "6";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        buttonSub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: no number inputted");
                        }
                        else {
                            num1 = Double.parseDouble(textView_result.getText().toString());
                            operator = "SUB";
                            nextNumber=true;
                        }
                    }
                }
        );

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("1");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "1";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("2");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "2";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("3");
                            nextNumber=false;
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "3";
                            textView_result.setText(temp);
                            nextNumber=false;
                        }
                    }
                }
        );

        buttonAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: No number inputted");
                        }
                        else {
                            num1 = Double.parseDouble(textView_result.getText().toString());
                            operator = "ADD";
                            nextNumber=true;
                        }
                    }
                }
        );

        button0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(nextNumber) {
                            textView_result.setText("");
                        }
                        else {
                            String temp = textView_result.getText().toString();
                            temp += "0";
                            textView_result.setText(temp);
                            nextNumber=false;

                        }
                    }
                }
        );

        buttonBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error: No number inputted");
                        }
                        else {
                            StringBuilder temp = new StringBuilder(textView_result.getText().toString());
                            temp = temp.deleteCharAt(temp.length()-1);
                            textView_result.setText(temp.toString());
                        }
                    }
                }
        );

        buttonDot.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String temp =textView_result.getText().toString();
                        temp += ".";
                        textView_result.setText(temp);
                    }
                }
        );

        buttonEqual.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(textView_result.getText().toString().equals("")) {
                            textView_result.setText("Error:No number Inputted");
                        }
                        else {
                            if(operator.equals("MOD")) {
                                num2 = Double.parseDouble(textView_result.getText().toString());
                                double result = num1%num2;
                                textView_result.setText(String.valueOf(result));
                                operator="";
                                nextNumber=true;
                            }
                            else if(operator.equals("DIV")) {
                                num2 = Double.parseDouble(textView_result.getText().toString());
                                double result = num1/num2;
                                textView_result.setText(String.valueOf(result));
                                operator="";
                                nextNumber=true;
                            }
                            else if(operator.equals("MUL")) {
                                num2 = Double.parseDouble(textView_result.getText().toString());
                                double result = num1*num2;
                                textView_result.setText(String.valueOf(result));
                                operator="";
                                nextNumber=true;
                            }
                            else if(operator.equals("SUB")) {
                                num2 = Double.parseDouble(textView_result.getText().toString());
                                double result = num1-num2;
                                textView_result.setText(String.valueOf(result));
                                operator="";
                                nextNumber=true;
                            }
                            else if(operator.equals("ADD")) {
                                num2 = Double.parseDouble(textView_result.getText().toString());
                                double result = num1+num2;
                                textView_result.setText(String.valueOf(result));
                                operator="";
                                nextNumber=true;
                            }
                        }
                    }
                }
        );
    }
}