package com.stockholm.api.store;


public class AddCommentReq {

    private UserCommentBean data;

    public AddCommentReq(UserCommentBean data) {
        setData(data);
    }

    public UserCommentBean getData() {
        return data;
    }

    public void setData(UserCommentBean data) {
        this.data = data;
    }

    public static class UserCommentBean {
        private float star;
        private String date;
        private String comment;

        public UserCommentBean(float star, String date, String comment) {
            setStar(star);
            setDate(date);
            setComment(comment);
        }

        public float getStar() {
            return star;
        }

        public void setStar(float star) {
            this.star = star;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

}