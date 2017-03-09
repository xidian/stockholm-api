package com.stockholm.api.store;


public class AddCommentReq {

    private UserCommentBean comment;

    public AddCommentReq(UserCommentBean data) {
        setComment(data);
    }

    public UserCommentBean getComment() {
        return comment;
    }

    public void setComment(UserCommentBean comment) {
        this.comment = comment;
    }

    public static class UserCommentBean {
        private float star;
        private String comment;

        public UserCommentBean(float star, String comment) {
            setStar(star);
            setComment(comment);
        }

        public float getStar() {
            return star;
        }

        public void setStar(float star) {
            this.star = star;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

}