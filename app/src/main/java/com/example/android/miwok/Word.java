package com.example.android.miwok;

import android.media.Image;

public class Word {
    public Word(String english, String mewok, int numbersImage) {
        this.english = english;
        this.mewok = mewok;
        this.numbersImage = numbersImage;
    }

    public Word(String english, String mewok) {
        this.english = english;
        this.mewok = mewok;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    private String english;

    public int getNumbersImage() {
        return numbersImage;
    }

    public void setNumbersImage(int numbersImage) {
        this.numbersImage = numbersImage;
    }

    private int numbersImage;

    public String getMewok() {
        return mewok;
    }

    public void setMewok(String mewok) {
        this.mewok = mewok;
    }

    private String mewok;


}
