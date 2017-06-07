package com.example.android.miwok;

/**
 * Created by Nick on 6/6/2017.
 */

public class Word {

    private String defaultTranslation, miwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

}
