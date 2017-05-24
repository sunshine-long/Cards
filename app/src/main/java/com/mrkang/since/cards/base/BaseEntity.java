package com.mrkang.since.cards.base;

import com.google.gson.annotations.SerializedName;
import com.mrkang.since.cards.bean.MessageBean;

import java.io.Serializable;

/**
 * Created by 康龙 on 2017/5/10.
 */

public class BaseEntity<E> implements Serializable {
    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private MessageBean message;
    @SerializedName("data")
    private E data;

    public boolean isSuccess() {
        return code == 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MessageBean getMessage() {
        return message;
    }

    public void setMessage(MessageBean message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
