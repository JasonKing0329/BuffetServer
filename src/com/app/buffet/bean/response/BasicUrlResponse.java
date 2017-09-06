package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.google.gson.annotations.SerializedName;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/09/01 14:35.
 */

public class BasicUrlResponse extends BaseHttpData {
    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
