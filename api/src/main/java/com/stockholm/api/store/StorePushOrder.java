package com.stockholm.api.store;


public final class StorePushOrder {

    public static final int STORE_PUSH_ORDER_START = 100;

    public static final int DEVICE_INSTALL_SUCCESS = 101;
    public static final int DEVICE_INSTALL_FAIL = 102;
    public static final int DEVICE_UNINSTALL_SUCCESS = 103;
    public static final int DEVICE_UNINSTALL_FAIL = 104;

    public static final int PLUGIN_INSTALL_SUCCESS = 105;
    public static final int PLUGIN_INSTALL_FAIL = 106;
    public static final int PLUGIN_UPDATE_SUCCESS = 107;
    public static final int PLUGIN_UPDATE_FAIL = 108;

    public static final int STORE_PUSH_ORDER_END = 110;

    private StorePushOrder() {

    }

}