package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/9/2.
 */
public class PublicKeyBean {

    /**
     * modulus : AKj9tCabRozUFOXU726X8T5AGTVtWR8euQBJ1NDE3TDxGGO4/DSebGQ1AO7GXryiWxPGu9iR6yCcd//gQ+oVc/j2hmot7dXjVWJxobaY5ThKmk61CkceULVo8g6H4eJNsRXuWFCqi8qYoSQSZqWDNm+4KjmOPbuA1XIbh2hu6Q2L
     * exponent : AQAB
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
        private String modulus;
        private String exponent;

        public String getModulus() {
            return modulus;
        }

        public void setModulus(String modulus) {
            this.modulus = modulus;
        }

        public String getExponent() {
            return exponent;
        }

        public void setExponent(String exponent) {
            this.exponent = exponent;
        }
    }
}
