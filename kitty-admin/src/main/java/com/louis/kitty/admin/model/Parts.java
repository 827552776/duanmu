package com.louis.kitty.admin.model;

public class Parts extends BaseModel{


    private Integer fId;

    private String name;

    private String attribute;

    private Integer quantity;

    private String specs;

    private String modle;

    private String ask;

    private String inputValue;

    private String sts;

    private String isBuy;

    private String supplier;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(String isBuy) {
        this.isBuy = isBuy;
    }
}
