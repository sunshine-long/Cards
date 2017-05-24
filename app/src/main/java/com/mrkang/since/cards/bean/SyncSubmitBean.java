package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/10/20.
 */

public class SyncSubmitBean {

    /*private DataBean data;
    *//**
     * type : success
     * content : 操作成功
     *//*

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

    @Table("sync_model")
    public static class DataBean {
        @PrimaryKey(AssignType.AUTO_INCREMENT)
        private int id;
        private List<String> banks;
        private List<Integer> bankCardIds;
        private List<?> shopIds;
        private List<?> promotionIds;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        public List<String> getBanks() {
            return banks;
        }

        public void setBanks(List<String> banks) {
            this.banks = banks;
        }

        public List<Integer> getBankCardIds() {
            return bankCardIds;
        }

        public void setBankCardIds(List<Integer> bankCardIds) {
            this.bankCardIds = bankCardIds;
        }

        public List<?> getShopIds() {
            return shopIds;
        }

        public void setShopIds(List<?> shopIds) {
            this.shopIds = shopIds;
        }

        public List<?> getPromotionIds() {
            return promotionIds;
        }

        public void setPromotionIds(List<?> promotionIds) {
            this.promotionIds = promotionIds;
        }
    }*/
}
