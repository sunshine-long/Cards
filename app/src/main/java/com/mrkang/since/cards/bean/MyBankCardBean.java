package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/9/7.
 */
public class MyBankCardBean {
    /**
     * type : success
     * content : 操作成功
     */

    /*private MessageBean message;
    *//**
     * bankCardId : 152
     * bankId : 5
     * bankName : 招商银行
     * bankIcon : http://192.168.2.101/creditCard/upload/bank/image/icon/cmb.png
     * bankLogo : http://192.168.2.101/creditCard/upload/bank/image/logo/cmb.png
     * cardNumber : 555
     * billDate : 4
     *//*

    private List<DataBean> data;

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }
    @Table("bankcard_model")
    public static class DataBean {
        @PrimaryKey(AssignType.BY_MYSELF)
        private int bankCardId;
        @NotNull
        private int bankId;
        @NotNull
        private String bankName;
        private String bankIcon;
        private String bankLogo;
        private String cardNumber;
        private int billDate;

        public int getBankCardId() {
            return bankCardId;
        }

        public void setBankCardId(int bankCardId) {
            this.bankCardId = bankCardId;
        }

        public int getBankId() {
            return bankId;
        }

        public void setBankId(int bankId) {
            this.bankId = bankId;
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

        public String getBankLogo() {
            return bankLogo;
        }

        public void setBankLogo(String bankLogo) {
            this.bankLogo = bankLogo;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public int getBillDate() {
            return billDate;
        }

        public void setBillDate(int billDate) {
            this.billDate = billDate;
        }
    }*/
}
