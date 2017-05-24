package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/9/7.
 */
public class AddBanksCardBean {

    /**
     * data : 257
     * message : {"type":"success","content":"操作成功"}
     */

    private int data;
    /**
     * type : success
     * content : 操作成功
     */

    private MessageBean message;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MessageBean getMessage() {
        return message;
    }
}
