package com.zz.myapp4;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        editText.setShowSoftInputOnFocus(false);
        editText.setRawInputType(InputType.TYPE_CLASS_TEXT);

        InputConnection inputConnection = editText.onCreateInputConnection(new EditorInfo());
        KeyboardCustomJava keyboardCustomJava = findViewById(R.id.keyboardCustom);
        keyboardCustomJava.setInputConnection(inputConnection);
    }
}