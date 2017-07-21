package com.stockholm.api.store;


import com.google.gson.Gson;
import com.stockholm.api.base.BaseResponse;

import java.util.List;

public class CommentListResp extends BaseResponse<List<AppCommentBean>> {
    private PageBean page;

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public static class PageBean {
        private int page;
        private int totalPages;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
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

    public static CommentListResp get(String json) {
        return new Gson().fromJson(json, CommentListResp.class);
    }

}