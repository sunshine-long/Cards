package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/18.
 */
public class CategoryDataBean {

    private DataBean data;
    /**
     * type : success
     * content : 操作成功
     */

    private MessageBean message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * name : 农行
         * icon : http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png
         * logo : http://192.168.2.116/creditCard/upload/bank/image/logo/abc.png
         * id : 1
         */

        private List<BanksBean> banks;
        /**
         * id : 606
         * name : 锦江区
         * grade : 1
         */

        private List<AddressCategoriesBean> addressCategories;
        /**
         * id : 1
         * name : 美食
         * grade : 0
         * image : null
         * icon : http://192.168.2.116/creditCard/upload/icon/美食.png
         */

        private List<ActivityCategoriesBean> activityCategories;

        public List<BanksBean> getBanks() {
            return banks;
        }

        public void setBanks(List<BanksBean> banks) {
            this.banks = banks;
        }

        public List<AddressCategoriesBean> getAddressCategories() {
            return addressCategories;
        }

        public void setAddressCategories(List<AddressCategoriesBean> addressCategories) {
            this.addressCategories = addressCategories;
        }

        public List<ActivityCategoriesBean> getActivityCategories() {
            return activityCategories;
        }

        public void setActivityCategories(List<ActivityCategoriesBean> activityCategories) {
            this.activityCategories = activityCategories;
        }

        public static class BanksBean {
            private String name;
            private String icon;
            private String logo;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class AddressCategoriesBean {
            private int id;
            private String name;
            private int grade;

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
        }

        public static class ActivityCategoriesBean {
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
    }

    public static class MessageBean {
        private String type;
        private String content;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
