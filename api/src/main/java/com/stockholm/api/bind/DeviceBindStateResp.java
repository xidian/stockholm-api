package com.stockholm.api.bind;


import com.stockholm.api.base.BaseResponse;

public class DeviceBindStateResp extends BaseResponse<DeviceBindStateResp.DataBean> {

    public static class DataBean {
        private int usersCount;
        private boolean showGuide;

        public int getUsersCount() {
            return usersCount;
        }

        public void setUsersCount(int usersCount) {
            this.usersCount = usersCount;
        }

        public boolean isShowGuide() {
            return showGuide;
        }

        public void setShowGuide(boolean showGuide) {
            this.showGuide = showGuide;
        }

        public boolean isDeviceBinded() {
            return usersCount > 0;
        }
    }

}