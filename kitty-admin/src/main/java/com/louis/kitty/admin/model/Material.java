package com.louis.kitty.admin.model;

public class Material extends BaseModel {
    private String name;

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
