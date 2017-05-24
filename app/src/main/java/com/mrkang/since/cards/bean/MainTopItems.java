package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/8/13.
 */
public class MainTopItems {
    private String title;
    private int icon;
    public MainTopItems(String title, int icon){
        this.title = title;
        this.icon = icon;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "MainTopItems{" +
                "title='" + title + '\'' +
                ", icon=" + icon +
                '}';
    }
}
