package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/25.
 */
public class ShopDetailBean {

    /**
     * id : 352
     * name : 何师烧烤阳光空中花园店
     * phones : ["028-64660708"]
     * image : http://www.lzrgsc.com/default_image/default_thumbnail.jpg
     * address : 一环路东五段87号阳光新业中心6楼露台
     * distance : null
     * activities : [{"id":402,"bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"5折","activityName":"何师烧烤","content":"凡农行\u201c金穗贷记卡\u201d持卡人在乙方所有门店刷卡消费，可享受全单半价，最高优惠100元，每卡每月可享受一次优惠，数量有限，先到先得，送完即止。","categoryName":"烧烤","beginDate":null,"endDate":"2016-03-31","validPeriod":"即日起至2016年3月31日每周五、六、日"},{"id":403,"bankName":"中行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/boc.png","typeName":"折","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"满100省50","activityName":"大龙火锅","content":"活动期间，凡持有农行\u201c金穗贷记卡\u201d的持卡人在成都辣风景源头餐饮有限公司旗下大龙燚火锅（九眼桥店、棕北店、玉林店、双楠店、长荣店、红星店、华阳店、温江店）刷卡消费，单笔满100元省50元，满200元省100元，满300元省150元，满400元省200元，最高优惠200元。每卡每月可享受一次优惠，数量有限，送完即止。","categoryName":"火锅","beginDate":null,"endDate":"2016-06-27","validPeriod":"即日起至2016年4月31日每周五、日"}]
     */

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
        private int id;
        private String name;
        private String image;
        private String address;
        private Object distance;
        private List<String> phones;
        /**
         * id : 402
         * bankName : 农行
         * bankIcon : http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png
         * typeName : 折
         * typeIcon :
         * image : http://www.lzrgsc.com/default_image/default_thumbnail.jpg
         * brief : 5折
         * activityName : 何师烧烤
         * content : 凡农行“金穗贷记卡”持卡人在乙方所有门店刷卡消费，可享受全单半价，最高优惠100元，每卡每月可享受一次优惠，数量有限，先到先得，送完即止。
         * categoryName : 烧烤
         * beginDate : null
         * endDate : 2016-03-31
         * validPeriod : 即日起至2016年3月31日每周五、六、日
         */

        private List<ActivitiesBean> activities;

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

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Object getDistance() {
            return distance;
        }

        public void setDistance(Object distance) {
            this.distance = distance;
        }

        public List<String> getPhones() {
            return phones;
        }

        public void setPhones(List<String> phones) {
            this.phones = phones;
        }

        public List<ActivitiesBean> getActivities() {
            return activities;
        }

        public void setActivities(List<ActivitiesBean> activities) {
            this.activities = activities;
        }

        public static class ActivitiesBean {
            private int id;
            private String bankName;
            private String bankIcon;
            private String typeName;
            private String typeIcon;
            private String image;
            private String brief;
            private String activityName;
            private String content;
            private String categoryName;
            private Object beginDate;
            private String endDate;
            private String validPeriod;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getBankName() {
                return bankName;
            }

            public void setBankName(String bankName) {
                this.bankName = bankName;
            }

            public String getBankIcon() {
                return bankIcon;
            }

            public void setBankIcon(String bankIcon) {
                this.bankIcon = bankIcon;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getTypeIcon() {
                return typeIcon;
            }

            public void setTypeIcon(String typeIcon) {
                this.typeIcon = typeIcon;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getBrief() {
                return brief;
            }

            public void setBrief(String brief) {
                this.brief = brief;
            }

            public String getActivityName() {
                return activityName;
            }

            public void setActivityName(String activityName) {
                this.activityName = activityName;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }

            public Object getBeginDate() {
                return beginDate;
            }

            public void setBeginDate(Object beginDate) {
                this.beginDate = beginDate;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public String getValidPeriod() {
                return validPeriod;
            }

            public void setValidPeriod(String validPeriod) {
                this.validPeriod = validPeriod;
            }
        }
    }

}
