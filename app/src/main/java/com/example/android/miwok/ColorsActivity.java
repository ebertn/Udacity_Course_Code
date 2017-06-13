package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.drawable.color_red, "red", "weṭeṭṭi"));
        words.add(new Word(R.drawable.color_green, "green", "chokokki"));
        words.add(new Word(R.drawable.color_brown, "brown", "ṭakaakki"));
        words.add(new Word(R.drawable.color_gray, "gray", "ṭopoppi"));
        words.add(new Word(R.drawable.color_black, "black", "kululli"));
        words.add(new Word(R.drawable.color_white, "white", "kelelli"));
        words.add(new Word(R.drawable.color_dusty_yellow, "dusty yellow", "ṭopiisә"));
        words.add(new Word(R.drawable.color_mustard_yellow, "mustard yellow", "chiwiiṭә"));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}