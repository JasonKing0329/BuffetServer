package com.app.buffet.bean.response;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: docversion接口正常返回
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/30 13:20
 */
public class DocVersionBean {

    @SerializedName("version")
    private String version;

    @SerializedName("promoteImageUrl")
    private String promoteImageUrl;

    @SerializedName("bgImageUrl")
    private String bgImageUrl;

    @SerializedName("promoteCode")
    private String promoteCode;

    @SerializedName("bgCode")
    private String bgCode;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPromoteImageUrl() {
        return promoteImageUrl;
    }

    public void setPromoteImageUrl(String promoteImageUrl) {
        this.promoteImageUrl = promoteImageUrl;
    }

    public String getBgImageUrl() {
        return bgImageUrl;
    }

    public void setBgImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

    public String getPromoteCode() {
        return promoteCode;
    }

    public void setPromoteCode(String promoteCode) {
        this.promoteCode = promoteCode;
    }

    public String getBgCode() {
        return bgCode;
    }

    public void setBgCode(String bgCode) {
        this.bgCode = bgCode;
    }
}
