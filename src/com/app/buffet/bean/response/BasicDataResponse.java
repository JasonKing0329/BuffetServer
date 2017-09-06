package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.google.gson.annotations.SerializedName;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/09/01 15:46.
 */

public class BasicDataResponse extends BaseHttpData {
    @SerializedName("type")
    private int type;
    @SerializedName("version")
    private String version;
    @SerializedName("devCode")
    private String devCode;
    @SerializedName("payUrl")
    private String payUrl;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("address")
    private String address;
    @SerializedName("tel")
    private String tel;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
