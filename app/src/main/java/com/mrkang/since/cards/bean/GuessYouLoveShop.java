package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/8/15.
 */
public class GuessYouLoveShop {

    private String image;
    private String shopName;
    private String location;
    private String discount;
    private String favorable;
    private String award;
    private String bank;
    private String distance;

    public GuessYouLoveShop(String image, String shopName, String location, String discount, String favorable, String award, String bank, String distance ){
        this.image = image;
        this.shopName = shopName;
        this.location = location;
        this.discount = discount;
        this.favorable = favorable;
        this.award = award;
        this.bank = bank;
        this.distance = distance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getFavorable() {
        return favorable;
    }

    public void setFavorable(String favorable) {
        this.favorable = favorable;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GuessYouLoveShop{" +
                "image='" + image + '\'' +
                ", shopName='" + shopName + '\'' +
                ", location='" + location + '\'' +
                ", discount='" + discount + '\'' +
                ", favorable='" + favorable + '\'' +
                ", award='" + award + '\'' +
                ", bank='" + bank + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
