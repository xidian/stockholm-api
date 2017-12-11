package com.stockholm.api.album;


import java.util.List;

public class MobilePathResp {

    private int errorCode;
    private List<String> data;
    private PageBean page;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public boolean isSuccess() {
        return errorCode == 0;
    }

}