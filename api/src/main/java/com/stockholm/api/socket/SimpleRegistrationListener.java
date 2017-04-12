package com.stockholm.api.socket;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;


public class SimpleRegistrationListener implements NsdManager.RegistrationListener {

    @Override
    public void onRegistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {

    }

    @Override
    public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int errorCode) {

    }

    @Override
    public void onServiceRegistered(NsdServiceInfo serviceInfo) {

    }

    @Override
    public void onServiceUnregistered(NsdServiceInfo serviceInfo) {

    }

}