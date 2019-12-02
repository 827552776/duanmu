package com.louis.kitty.admin.model;

public class TrStockManage extends BaseModel {
    private String trName;
    private String trType;
    private String trSubdivide;
    private String trNumber;
    private String trPrice;
    private String trRemarks;

    @Override
    public String toString() {
        return "TrStockManage{" +
                "trName='" + trName + '\'' +
                ", trType='" + trType + '\'' +
                ", trSubdivide='" + trSubdivide + '\'' +
                ", trNumber='" + trNumber + '\'' +
                ", trPrice='" + trPrice + '\'' +
                ", trRemarks='" + trRemarks + '\'' +
                '}';
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public String getTrSubdivide() {
        return trSubdivide;
    }

    public void setTrSubdivide(String trSubdivide) {
        this.trSubdivide = trSubdivide;
    }

    public String getTrNumber() {
        return trNumber;
    }

    public void setTrNumber(String trNumber) {
        this.trNumber = trNumber;
    }

    public String getTrPrice() {
        return trPrice;
    }

    public void setTrPrice(String trPrice) {
        this.trPrice = trPrice;
    }

    public String getTrRemarks() {
        return trRemarks;
    }

    public void setTrRemarks(String trRemarks) {
        this.trRemarks = trRemarks;
    }
}
