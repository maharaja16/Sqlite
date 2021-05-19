package com.example.recycle;

public class Exampleitem {

    private int mImageResource;
    private String mTEXT1;
    private String mText2;

    public Exampleitem(int mImageResource, String mTEXT1, String mText2) {
        this.mImageResource = mImageResource;
        this.mTEXT1 = mTEXT1;
        this.mText2 = mText2;
    }
    public void changeText1(String text) {
        mTEXT1 = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmTEXT1() {
        return mTEXT1;
    }

    public void setmTEXT1(String mTEXT1) {
        this.mTEXT1 = mTEXT1;
    }

    public String getmText2() {
        return mText2;
    }

    public void setmText2(String mText2) {
        this.mText2 = mText2;
    }
}
