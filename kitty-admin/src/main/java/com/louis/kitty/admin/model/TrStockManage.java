package com.louis.kitty.admin.model;

public class TrStockManage extends BaseModel {
    private String trName;
    private String trType;
    private String trSubdivide;
    private int trNumber;
    private String trPrice;
    private String trRemarks;
    private int inNumber;
    private int outNumber;
    private String typeN;

    @Override
    public String toString() {
        return "TrStockManage{" +
                "trName='" + trName + '\'' +
                ", trType='" + trType + '\'' +
                ", trSubdivide='" + trSubdivide + '\'' +
                ", trNumber=" + trNumber +
                ", trPrice='" + trPrice + '\'' +
                ", trRemarks='" + trRemarks + '\'' +
                ", inNumber=" + inNumber +
                ", outNumber=" + outNumber +
                ", typeN='" + typeN + '\'' +
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

    public int getTrNumber() {
        return trNumber;
    }

    public void setTrNumber(int trNumber) {
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

    public int getInNumber() {
        return inNumber;
    }

    public void setInNumber(int inNumber) {
        this.inNumber = inNumber;
    }

    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    public String getTypeN() {
        return typeN;
    }

    public void setTypeN(String typeN) {
        this.typeN = typeN;
    }
}
