package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/8/17.
 */

/**
 * id : 1
 * name : 美食
 * grade : 0
 * image : null
 * icon : http://192.168.2.116/creditCard/upload/icon/美食.png
 */
public class CategoriesBean {
    private int id;
    private String name;
    private int grade;
    private Object image;
    private String icon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
