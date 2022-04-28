package com.example.myapplication;

public enum ModelObject {


    page(R.string.pg, R.layout.page1),
    page2(R.string.pg2, R.layout.page2);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }


    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
