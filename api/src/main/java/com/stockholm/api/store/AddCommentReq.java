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
        private String content;

        public UserCommentBean(float star, String content) {
            setStar(star);
            setContent(content);
        }

        public float getStar() {
            return star;
        }

        public void setStar(float star) {
            this.star = star;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

}