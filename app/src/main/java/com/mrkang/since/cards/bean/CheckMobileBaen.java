package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/9/5.
 */
public class CheckMobileBaen {

    /**
     * data : false
     * message : {"type":"success","content":"操作成功"}
     */

    private boolean data;
    /**
     * type : success
     * content : 操作成功
     */

    private MessageBean message;

    public boolean isData() {
        return data;
    }

    public void setData(boolean data) {
        this.data = data;
    }

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

}
