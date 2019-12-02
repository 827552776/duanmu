package com.louis.kitty.admin.model;


public class BCustomer extends BaseModel {
    private String cmName;
    private String cmAddress;
    private String cmContacts;
    private String cmPhone;
    private String cmRemarks;

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName;
    }

    public String getCmAddress() {
        return cmAddress;
    }

    public void setCmAddress(String cmAddress) {
        this.cmAddress = cmAddress;
    }

    public String getCmContacts() {
        return cmContacts;
    }

    public void setCmContacts(String cmContacts) {
        this.cmContacts = cmContacts;
    }

    public String getCmPhone() {
        return cmPhone;
    }

    public void setCmPhone(String cmPhone) {
        this.cmPhone = cmPhone;
    }

    public String getCmRemarks() {
        return cmRemarks;
    }

    public void setCmRemarks(String cmRemarks) {
        this.cmRemarks = cmRemarks;
    }
}
