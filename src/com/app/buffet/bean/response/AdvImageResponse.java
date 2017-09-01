package com.app.buffet.bean.response;

import com.app.buffet.bean.data.AdvImageBean;
import com.app.buffet.bean.data.BaseHttpData;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 广告图更新返回
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/1 8:54
 */
public class AdvImageResponse extends BaseHttpData {

    @SerializedName("imageList")
    private List<AdvImageBean> imageList;

    @SerializedName("code")
    private String code;

    public List<AdvImageBean> getImageList() {
        return imageList;
    }

    public void setImageList(List<AdvImageBean> imageList) {
        this.imageList = imageList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
