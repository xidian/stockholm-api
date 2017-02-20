package com.stockholm.api.profile;


public class UpdatePwdReq {
    private String oldPwd;
    private String newPwd;

    public UpdatePwdReq(String oldPwd, String newPwd) {
        setOldPwd(oldPwd);
        setNewPwd(newPwd);
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

}