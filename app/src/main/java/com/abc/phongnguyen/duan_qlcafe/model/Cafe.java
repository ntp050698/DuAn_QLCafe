package com.abc.phongnguyen.duan_qlcafe.model;


public class Cafe {

    private String mTeaName;
    private int mImageResourceId;

    public Cafe(String teaName, int imageResourceId) {
        mTeaName = teaName;
        mImageResourceId = imageResourceId;
    }

    public String getTeaName() {
        return mTeaName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
