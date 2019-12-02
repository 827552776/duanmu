package com.louis.kitty.admin.model;

public class AccessStock extends BaseModel {
    /**
     * 名称
     */
    private String name;

    @Override
    public String toString() {
        return "AccessStock{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", subdivide='" + subdivide + '\'' +
                ", number='" + number + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubdivide() {
        return subdivide;
    }

    public void setSubdivide(String subdivide) {
        this.subdivide = subdivide;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 类型
     */
    private String type;
    /**
     * 细分
     */
    private String subdivide;
    /**
     * 数量
     */
    private String number;
    /**
     * 类型（出/入库）
     */
    private String state;
}
