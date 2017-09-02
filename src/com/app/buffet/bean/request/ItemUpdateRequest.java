package com.app.buffet.bean.request;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 菜品更新请求
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/2 8:49
 */
public class ItemUpdateRequest extends BaseRequest {

    @SerializedName("imgCode")
    private String imgCode;

    @SerializedName("imgClassCode")
    private String imgClassCode;

    @SerializedName("clearCode")
    private String clearCode;

    @SerializedName("limitCode")
    private String limitCode;

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    public String getImgClassCode() {
        return imgClassCode;
    }

    public void setImgClassCode(String imgClassCode) {
        this.imgClassCode = imgClassCode;
    }

    public String getClearCode() {
        return clearCode;
    }

    public void setClearCode(String clearCode) {
        this.clearCode = clearCode;
    }

    public String getLimitCode() {
        return limitCode;
    }

    public void setLimitCode(String limitCode) {
        this.limitCode = limitCode;
    }
}
