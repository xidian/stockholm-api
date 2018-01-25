package com.stockholm.api.setting.task.config;

public class TaskOption {


    /**
     * icon :
     * name : 铃声
     * taskId : djkitF
     * checked : false
     * desc : 音乐提醒
     * installed : true
     * online : true
     * fromStore : false
     * order : 0
     * conflict : false
     * packageName : com.stockholm.clock
     */

    private String icon;
    private String name;
    private String taskId;
    private boolean checked;
    private String desc;
    private boolean installed;
    private boolean online;
    private boolean fromStore;
    private int order;
    private boolean conflict;
    private String packageName;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isFromStore() {
        return fromStore;
    }

    public void setFromStore(boolean fromStore) {
        this.fromStore = fromStore;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isConflict() {
        return conflict;
    }

    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
