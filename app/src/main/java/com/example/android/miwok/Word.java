package com.example.android.miwok;

import android.media.Image;

public class Word {
    public Word(String english, String mewok, int numbersImage, int soundId) {
        this.english = english;
        this.mewok = mewok;
        this.numbersImage = numbersImage;
        this.soundId = soundId;
    }

    public Word(String english, String mewok,int soundId) {
        this.english = english;
        this.mewok = mewok;
        this.soundId = soundId;
    }

    private int soundId;

    public int getSoundId(){
        return soundId;
    }
    public String getEnglish() {
        return english;
    }

    private String english;

    public int getNumbersImage() {
        return numbersImage;
    }

    private int numbersImage;

    public String getMewok() {
        return mewok;
    }

    private String mewok;


}
