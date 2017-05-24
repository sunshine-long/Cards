package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/9/2.
 */
public class GetCodeMessageBean {

    /**
     * type : error
     * content : 2分钟内只能请求一次验证码
     */

    private MessageBean message;

    public MessageBean getMessage() {
        return message;
    }
    public void setMessage(MessageBean message) {
        this.message = message;
    }
}
