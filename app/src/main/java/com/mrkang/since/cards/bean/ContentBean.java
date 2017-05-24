package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/17.
 */

/**
 * id : 374
 * path : /shop/content/201608/374.html
 * name : 高新皇冠假日酒店
 * image : null
 * business : 郫县
 * address : 成都市高新西区西芯大道1号
 * distance : null
 * activities : [{"id":411,"activityName":"高新皇冠假日酒店花岸餐厅自助西餐","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":null,"brief":"两人同行，一人免单"}]
 */
public class ContentBean {

    private int id;
    private String path;
    private String name;
    private String image;
    private String business;
    private String address;
    private String distance;

    private List<ActivitiesBean> activities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public List<ActivitiesBean> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivitiesBean> activities) {
        this.activities = activities;
    }
}
