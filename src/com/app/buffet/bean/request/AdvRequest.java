package com.app.buffet.bean.request;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 广告图更新请求
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/1 8:49
 */
public class AdvRequest extends BaseRequest {

    @SerializedName("code")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
