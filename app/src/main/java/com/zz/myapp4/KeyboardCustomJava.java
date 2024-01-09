package com.zz.myapp4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class KeyboardCustomJava extends LinearLayout implements View.OnClickListener {

    private InputConnection inputConnection;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;


    public KeyboardCustomJava(Context context) {
        super(context);
        initialization(context);
    }

    public KeyboardCustomJava(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialization(context);
    }

    public KeyboardCustomJava(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialization(context);
    }

    public KeyboardCustomJava(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialization(context);
    }

    private void initialization(Context context){
        LayoutInflater.from(context).inflate(R.layout.keybaord_custom, this, true);
        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button6 = findViewById(R.id.b6);
        button7 = findViewById(R.id.b7);
        button8 = findViewById(R.id.b8);
        button9 = findViewById(R.id.b9);
        buttonA = findViewById(R.id.bA);
        buttonB = findViewById(R.id.bB);
        buttonC = findViewById(R.id.bC);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (inputConnection == null){
            return;
        }
        String stringValue = ((Button) view).getText().toString();
        inputConnection.commitText(stringValue, 1);
    }

    public void setInputConnection(InputConnection inputConnectionLocal){
        this.inputConnection = inputConnectionLocal;
    }
}