package com.zz.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class SecondActivity extends AppCompatActivity {
    Button Abutton;
    String[] alpha = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    ArrayList used = new ArrayList();
    String[] words = new String[] {"flight", "university", "country", "audience", "church", "payment", "analyst", "poet", "collection", "responsibility", "version", "passion", "classroom", "energy", "expression", "agency", "perspective", "employer", "elevator", "ear", "son", "throat", "republic", "sample", "indication", "baseball", "cell", "context", "product", "platform", "interaction", "lake", "surgery", "control", "establishment", "construction", "bird", "imagination", "meal", "decision", "midnight", "depression", "studio", "wife", "member", "height", "affair", "heart", "mode", "area"};
    int randomNum = ThreadLocalRandom.current().nextInt(0, 50 + 1);
    String word = words[randomNum];
    int wordlen = word.length();
    String progess = makeBlankStr((wordlen));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        Abutton = (Button) findViewById(R.id.A);
//        Abutton.setOnClickListener();
    }
    public String makeBlankStr(int len) {
        String toReturn = "";
        for (int i = 0; i < len; i++) {
            toReturn = toReturn + "_ ";
        }
        return toReturn;
    }
    public String makeMove(String letter) {
        if (!used.contains(letter)) {
            used.add(letter);
            }
        if (word.contains(letter)) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i).toString() == letter) {
                    progress.setCharAt(i, letter); //type issue here, probably..
                }
            }
        }

    }


}