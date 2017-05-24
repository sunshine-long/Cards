package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/25.
 */
public class MainShopListBean {

    /**
     * pageInfo : {"total":4,"more":1,"current":1,"pageSize":10}
     * content : [{"id":455,"path":"/shop/content/201608/455.html","name":"保利中影奥克斯店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"武侯区","address":"成都锦城大道奥克斯广场","distance":null,"activities":[{"id":504,"activityName":"保利中影","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]},{"id":454,"path":"/shop/content/201608/454.html","name":"保利中影复城店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"武侯区","address":"成都市高新区天府二街复城国际","distance":null,"activities":[{"id":504,"activityName":"保利中影","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]},{"id":453,"path":"/shop/content/201608/453.html","name":"影立方","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"圣灯","address":"成都市成华区建设南支路4号","distance":null,"activities":[{"id":503,"activityName":"影立方","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]},{"id":452,"path":"/shop/content/201608/452.html","name":"新时代影城高塔店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"牛王庙","address":"成都市成华区猛追湾街94号欢乐颂购物中心A栋3楼399号","distance":null,"activities":[{"id":502,"activityName":"新时代影城","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]},{"id":402,"path":"/shop/content/201608/402.html","name":"CGV影城金牛店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"西南交大","address":"成都市金牛区交大路183号凯德广场2期4楼","distance":null,"activities":[{"id":454,"activityName":"CGV影城","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]},{"id":373,"path":"/shop/content/201608/373.html","name":"希尔顿酒店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"武侯区","address":"天府大道中段666号成都希尔顿酒店一楼MIX 聚餐厅","distance":null,"activities":[{"id":410,"activityName":"希尔顿酒店自助西餐","bankName":"建行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/ccb.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"两人同行，一人免单"}]},{"id":374,"path":"/shop/content/201608/374.html","name":"高新皇冠假日酒店","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"郫县","address":"成都市高新西区西芯大道1号","distance":null,"activities":[{"id":411,"activityName":"高新皇冠假日酒店花岸餐厅自助西餐","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"两人同行，一人免单"}]},{"id":372,"path":"/shop/content/201608/372.html","name":"明宇豪雅","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"盐市口","address":"成都市锦江区人民南路二段一号仁恒置地广场4.5层","distance":null,"activities":[{"id":409,"activityName":"明宇豪雅自助西餐","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"两人同行，一人免单"}]},{"id":371,"path":"/shop/content/201608/371.html","name":"卡弗特汽车美容","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"涌泉","address":"成都温江柳城光华大道三段1588号珠江广场地下二层B159号","distance":null,"activities":[{"id":408,"activityName":"卡弗特汽车美容","bankName":"建行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/ccb.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"9元洗车"}]},{"id":370,"path":"/shop/content/201608/370.html","name":"四海一家","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","business":"盐市口","address":"成都市锦江区人民南路二段一号仁恒置地广场4.5层","distance":null,"activities":[{"id":407,"activityName":"四海一家","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"两人同行，一人免单"}]}]
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
         * total : 4
         * more : 1
         * current : 1
         * pageSize : 10
         */

        private PageInfoBean pageInfo;
        /**
         * id : 455
         * path : /shop/content/201608/455.html
         * name : 保利中影奥克斯店
         * image : http://www.lzrgsc.com/default_image/default_thumbnail.jpg
         * business : 武侯区
         * address : 成都锦城大道奥克斯广场
         * distance : null
         * activities : [{"id":504,"activityName":"保利中影","bankName":"农行","bankIcon":"http://192.168.2.116/creditCard/upload/bank/image/icon/abc.png","typeName":"惠","typeIcon":"","image":"http://www.lzrgsc.com/default_image/default_thumbnail.jpg","brief":"10元看电影"}]
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

    }
}
