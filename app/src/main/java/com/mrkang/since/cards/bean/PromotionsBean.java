package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/8/17.
 */

/**
 * title : 永辉超市购物随机减5元
 * image : http://localhost/creditCard/upload/bank/promotion/永辉超市购物随机减5元.png
 * url : http://mp.weixin.qq.com/s?__biz=MjM5OTExMzIwMA==&mid=2650358078&idx=2&sn=c88d4e37213879a1791229e8c49bc406&scene=0#rd
 * bankName : 农行
 */

public class PromotionsBean {
    private String title;
    private String image;
    private String url;
    private String bankName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
