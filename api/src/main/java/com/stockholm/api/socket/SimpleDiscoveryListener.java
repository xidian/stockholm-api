package com.stockholm.api.socket;


import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

public class SimpleDiscoveryListener implements NsdManager.DiscoveryListener {

    @Override
    public void onStartDiscoveryFailed(String serviceType, int errorCode) {

    }

    @Override
    public void onStopDiscoveryFailed(String serviceType, int errorCode) {

    }

    @Override
    public void onDiscoveryStarted(String serviceType) {

    }

    @Override
    public void onDiscoveryStopped(String serviceType) {

    }

    @Override
    public void onServiceFound(NsdServiceInfo serviceInfo) {

    }

    @Override
    public void onServiceLost(NsdServiceInfo serviceInfo) {

    }

}