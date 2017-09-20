package com.stockholm.api.rom;

public class RomInfo {

    public RomInfo(String versionName, String version, String launcherVersion) {
        this.versionName = versionName;
        this.version = version;
        this.launcherVersion = launcherVersion;
    }

    private String versionName;

    private String version;

    private String launcherVersion;

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLauncherVersion() {
        return launcherVersion;
    }

    public void setLauncherVersion(String launcherVersion) {
        this.launcherVersion = launcherVersion;
    }
}
