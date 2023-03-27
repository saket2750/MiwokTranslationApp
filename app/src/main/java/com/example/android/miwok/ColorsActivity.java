package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);
        List<Word> words = new ArrayList<>();
        words.add(new Word("Red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "chokokki",R.drawable.color_green));
        words.add(new Word("Brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new Word("Gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("Black", "kululli", R.drawable.color_black));
        words.add(new Word("White", "kelelli", R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(ColorsActivity.this,0,words, R.color.category_colors);
        ListView l = findViewById(R.id.list);
        l.setAdapter(adapter);
    }
}