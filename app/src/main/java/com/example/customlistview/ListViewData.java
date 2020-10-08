package com.example.customlistview;

import android.graphics.drawable.Drawable;

public class ListViewData {

    public String header;
    public String text;
    private Drawable image;
    public boolean checkbox;

    public ListViewData(String header, String text, Drawable image, boolean checkbox) {
        this.header = header;
        this.text = text;
        this.image = image;
        this.checkbox = checkbox;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
