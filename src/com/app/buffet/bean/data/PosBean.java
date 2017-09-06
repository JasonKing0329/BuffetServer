package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

public class PosBean {
    @SerializedName("id")
    private int id;
    //POS名称
    @SerializedName("name")
    private String name;
    //POS编号
    @SerializedName("code")
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
