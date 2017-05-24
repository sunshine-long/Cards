package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/23.
 */
public class CategorySearchShopBean {

    /**
     * pageInfo : {"total":3,"more":1,"current":1,"pageSize":10}
     * content : [{"id":354,"path":"/shop/content/201608/354.html","name":"何师烧烤双林露台店","image":null,"business":"牛王庙","address":"成都市双林路91号","distance":"2.5","activities":[{"id":402,"activityName":"何师烧烤","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"5折"}]},{"id":353,"path":"/shop/content/201608/353.html","name":"何师烧烤正成概念店","image":null,"business":"书院街","address":"成都市梓潼桥正街45号","distance":"2.8","activities":[{"id":402,"activityName":"何师烧烤","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"5折"}]},{"id":369,"path":"/shop/content/201608/369.html","name":"味蜀吾老火锅","image":null,"business":"青龙","address":"成都市成华区洪山北路99号","distance":"3.1","activities":[{"id":406,"activityName":"味蜀吾老火锅","bankName":"建行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/ccb.png","typeName":"折","typeIcon":"","image":null,"brief":"满300省100"}]},{"id":362,"path":"/shop/content/201608/362.html","name":"大龙火锅红星店","image":null,"business":"东门大桥","address":"锦江区东升街89号1层2号","distance":"3.9","activities":[{"id":403,"activityName":"大龙火锅","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"满100省50"}]},{"id":352,"path":"/shop/content/201608/352.html","name":"何师烧烤阳光空中花园店","image":null,"business":"牛王庙","address":"一环路东五段87号阳光新业中心6楼露台","distance":"4.0","activities":[{"id":402,"activityName":"何师烧烤","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"5折"}]},{"id":361,"path":"/shop/content/201608/361.html","name":"大龙火锅九眼桥店","image":null,"business":"牛王庙","address":"锦江区宏济新路330号","distance":"4.3","activities":[{"id":403,"activityName":"大龙火锅","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"满100省50"}]},{"id":370,"path":"/shop/content/201608/370.html","name":"四海一家","image":null,"business":"盐市口","address":"成都市锦江区人民南路二段一号仁恒置地广场4.5层","distance":"4.4","activities":[{"id":407,"activityName":"四海一家","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":null,"brief":"两人同行，一人免单"}]},{"id":372,"path":"/shop/content/201608/372.html","name":"明宇豪雅","image":null,"business":"盐市口","address":"成都市锦江区人民南路二段一号仁恒置地广场4.5层","distance":"4.4","activities":[{"id":409,"activityName":"明宇豪雅自助西餐","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":null,"brief":"两人同行，一人免单"}]},{"id":368,"path":"/shop/content/201608/368.html","name":"重庆钢头火锅","image":null,"business":"人民公园","address":"成都市长顺上街55号","distance":"4.6","activities":[{"id":405,"activityName":"重庆钢头火锅","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"满200省100"}]},{"id":366,"path":"/shop/content/201608/366.html","name":"大龙火锅棕北店","image":null,"business":"科华北路","address":"武侯区科院路5号","distance":"6.4","activities":[{"id":403,"activityName":"大龙火锅","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"满100省50"}]}]
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
        /**
         * total : 3
         * more : 1
         * current : 1
         * pageSize : 10
         */

        private PageInfoBean pageInfo;
        /**
         * id : 354
         * path : /shop/content/201608/354.html
         * name : 何师烧烤双林露台店
         * image : null
         * business : 牛王庙
         * address : 成都市双林路91号
         * distance : 2.5
         * activities : [{"id":402,"activityName":"何师烧烤","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"折","typeIcon":"","image":null,"brief":"5折"}]
         */

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

        public static class PageInfoBean {
            private int total;
            private int more;
            private int current;
            private int pageSize;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public int getMore() {
                return more;
            }

            public void setMore(int more) {
                this.more = more;
            }

            public int getCurrent() {
                return current;
            }

            public void setCurrent(int current) {
                this.current = current;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }
        }

        public static class ContentBean {
            private int id;
            private String path;
            private String name;
            private String image;
            private String business;
            private String address;
            private String distance;
            /**
             * id : 402
             * activityName : 何师烧烤
             * bankName : 农行
             * bankIcon : http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png
             * typeName : 折
             * typeIcon :
             * image : null
             * brief : 5折
             */

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

            public static class ActivitiesBean {
                private int id;
                private String activityName;
                private String bankName;
                private String bankIcon;
                private String typeName;
                private String typeIcon;
                private Object image;
                private String brief;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getActivityName() {
                    return activityName;
                }

                public void setActivityName(String activityName) {
                    this.activityName = activityName;
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

                public Object getImage() {
                    return image;
                }

                public void setImage(Object image) {
                    this.image = image;
                }

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }
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
