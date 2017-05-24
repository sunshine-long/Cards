package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/9/7.
 */
public class NewMainDataBean {

        /**
         * title : 激情仲夏·电银赢好礼
         * image : http://192.168.2.101/creditCard/upload/bank/promotion/农行刷卡风暴第一波.jpg
         * url : http://mp.weixin.qq.com/s?__biz=MjM5OTExMzIwMA==&mid=2650358097&idx=1&sn=688cfbe7d7bd37e125a8c66976b187e2&scene=0#rd
         * bankName : 农行
         */

        private List<PromotionsBean> promotions;
        /**
         * name : 农行
         * fullName : 农业银行
         * icon : http://192.168.2.101/creditCard/upload/bank/image/icon/abc.png
         * logo : http://192.168.2.101/creditCard/upload/bank/image/logo/abc.png
         * image : http://192.168.2.101/creditCard/upload/bank/image/card/农业银行.png
         * id : 1
         * hasBonded : true
         */
        private List<BanksBean> banks;

        public List<PromotionsBean> getPromotions() {
            return promotions;
        }

        public void setPromotions(List<PromotionsBean> promotions) {
            this.promotions = promotions;
        }

        public List<BanksBean> getBanks() {
            return banks;
        }

        public void setBanks(List<BanksBean> banks) {
            this.banks = banks;
        }

        public static class BanksBean {
            private String name;
            private String fullName;
            private String icon;
            private String logo;
            private String image;
            private int id;
            private boolean hasBonded;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isHasBonded() {
                return hasBonded;
            }

            public void setHasBonded(boolean hasBonded) {
                this.hasBonded = hasBonded;
            }
        }

}
