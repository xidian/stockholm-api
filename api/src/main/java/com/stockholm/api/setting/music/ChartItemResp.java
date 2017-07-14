package com.stockholm.api.setting.music;


import java.util.List;

public class ChartItemResp {

    private PageBean page;
    private List<MusicBean> data;

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public List<MusicBean> getData() {
        return data;
    }

    public void setData(List<MusicBean> data) {
        this.data = data;
    }

    public static class PageBean {

        private int totalPages;

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }
    }

}
