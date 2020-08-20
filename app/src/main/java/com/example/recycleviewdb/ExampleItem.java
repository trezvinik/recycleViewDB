package com.example.recycleviewdb;

public class ExampleItem {
    private int mPvNr;
    private String mRealName;

    public ExampleItem(int PvNr, String RealName) {
        mPvNr = PvNr;
        mRealName = RealName;
    }

    public int getPvNr() {
        return mPvNr;
    }

    public String getRealName() {
        return mRealName;
    }
}