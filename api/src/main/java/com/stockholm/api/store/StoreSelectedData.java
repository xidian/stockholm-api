package com.stockholm.api.store;


import java.util.List;

public class StoreSelectedData {

    private List<BannerBean> banners;
    private List<AppBean> ranking;
    private List<AppBean> recommendations;

    public List<BannerBean> getBanners() {
        return banners;
    }

    public void setBanners(List<BannerBean> banners) {
        this.banners = banners;
    }

    public List<AppBean> getRanking() {
        return ranking;
    }

    public void setRanking(List<AppBean> ranking) {
        this.ranking = ranking;
    }

    public List<AppBean> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<AppBean> recommendations) {
        this.recommendations = recommendations;
    }

}