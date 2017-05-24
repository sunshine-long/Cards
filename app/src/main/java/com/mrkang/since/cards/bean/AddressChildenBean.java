package com.mrkang.since.cards.bean;

import java.util.List;

/**
 * Created by administer on 2016/8/19.
 */
public class AddressChildenBean {

    /**
     * type : success
     * content : 操作成功
     */

    private MessageBean message;
    /**
     * id : 606
     * name : 锦江区
     * grade : 1
     */

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

    public static class DataBean {
        private int id;
        private String name;
        private int grade;

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

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
}
