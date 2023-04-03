package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;
    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects, int color) {
        super(context, resource, objects);
        colorResourceId = color;
    }

    @Override
        public View getView(int position,View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word word = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        nameTextView.setText(word.getEnglish());

        TextView mewokTextView = (TextView) listItemView.findViewById(R.id.mewok_text_view);
        mewokTextView.setText(word.getMewok());

        ImageView imageIcon = (ImageView) listItemView.findViewById(R.id.image_icon);
        imageIcon.setImageResource(word.getNumbersImage());
        if(null == imageIcon){
            imageIcon.setVisibility(View.GONE);
        }
        else
            imageIcon.setVisibility(View.VISIBLE);


        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer player = MediaPlayer.create(view.getContext(), word.getSoundId());
                player.start();
                if(!player.isPlaying()){
                    player.release();
                }
            }
        });

        View textBackground = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textBackground.setBackgroundColor(color);

        return listItemView;
        }


}

