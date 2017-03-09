package com.stockholm.api.store;


import com.google.gson.Gson;

import java.util.List;

public class AppCommentResp {
    private boolean success;
    private String msg;
    private List<AppCommentBean> data;
    private PageBean page;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<AppCommentBean> getData() {
        return data;
    }

    public void setData(List<AppCommentBean> data) {
        this.data = data;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public static class PageBean {
        private int currentPage;
        private int totalPage;
        private int nextPage;

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        public static PageBean get(String json) {
            return new Gson().fromJson(json, PageBean.class);
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AppCommentResp get(String json) {
        return new Gson().fromJson(json, AppCommentResp.class);
    }

}