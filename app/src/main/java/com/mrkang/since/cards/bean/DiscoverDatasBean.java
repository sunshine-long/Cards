package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/17.
 */
public class DiscoverDatasBean {

    private ShopsBean shops;

    private List<PromotionsBean> promotions;

    private List<ActivitiesBean> activities;

    private List<CategoriesBean> categories;

    public ShopsBean getShops() {
        return shops;
    }

    public void setShops(ShopsBean shops) {
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

    public static class ShopsBean {

        private PageInfoBean pageInfo;

        private List<ContentBean> content;

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }

    }

}

