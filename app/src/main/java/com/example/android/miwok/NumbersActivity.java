package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);

        List<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo’e",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na’aacha",R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(NumbersActivity.this,0,words, R.color.category_numbers);
        /*String[] word = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
       for(String i: word)
       {
           words.add(i);
       }*/
        //ArrayAdapter<Word> adapter = new ArrayAdapter<>(this, R.layout.list_item,words);
        ListView l = findViewById(R.id.list);
        l.setAdapter(adapter);
    }
}