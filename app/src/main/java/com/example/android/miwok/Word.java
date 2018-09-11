package com.example.android.miwok;

/**
 * Created by sonakshi on 21-06-2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation) {
                mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
    }

    public String getDefaultTranslation() {
                return mDefaultTranslation;
    }

    public String  getMiwokTranslation() {
                return mMiwokTranslation;
            }

    public int getImageResourceId(){
        return mResourceId;
    }

    public boolean hasImage() {
                return mImageResourceId != NO_IMAGE_PROVIDED;
            }


}

