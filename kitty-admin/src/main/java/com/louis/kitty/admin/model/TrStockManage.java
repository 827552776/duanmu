package com.louis.kitty.admin.model;

public class TrStockManage extends BaseModel {
    private String trName;
    private String trType;
    /**
     * 差额
     */
    private int xNumber;
    /**
     * 实盘数
     */
    private int number;
    private String trSubdivide;
    private int trNumber;
    private String trPrice;
    private String trRemarks;
    private int inNumber;
    private int outNumber;
    private int type;
    private int typeNumber;

    @Override
    public String toString() {
        return "TrStockManage{" +
                "trName='" + trName + '\'' +
                ", trType='" + trType + '\'' +
                ", xNumber=" + xNumber +
                ", number=" + number +
                ", trSubdivide='" + trSubdivide + '\'' +
                ", trNumber=" + trNumber +
                ", trPrice='" + trPrice + '\'' +
                ", trRemarks='" + trRemarks + '\'' +
                ", inNumber=" + inNumber +
                ", outNumber=" + outNumber +
                ", type=" + type +
                ", typeNumber=" + typeNumber +
                '}';
    }

    public int getxNumber() {
        return xNumber;
    }

    public void setxNumber(int xNumber) {
        this.xNumber = xNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
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
}
