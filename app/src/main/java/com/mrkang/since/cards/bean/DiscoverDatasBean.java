package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/17.
 */
public class DiscoverDatasBean {

    private MainShopListBean shops;

    private List<PromotionsBean> promotions;

    private List<ActivitiesBean> activities;

    private List<CategoriesBean> categories;

    public MainShopListBean getShops() {
        return shops;
    }

    public void setShops(MainShopListBean shops) {
        this.shops = shops;
    }

    public List<PromotionsBean> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<PromotionsBean> promotions) {
        this.promotions = promotions;
    }

    public List<ActivitiesBean> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivitiesBean> activities) {
        this.activities = activities;
    }

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

}

