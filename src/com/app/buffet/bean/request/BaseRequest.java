package com.app.buffet.bean.request;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 基础请求字段
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:25
 */
public class BaseRequest {

    @SerializedName("posId")
    private String posId;

    @SerializedName("devCode")
    private String devCode;

    @SerializedName("devId")
    private String devId;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }
}
