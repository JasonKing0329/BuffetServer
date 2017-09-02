package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.IdBean;
import com.app.buffet.bean.data.ItemClearBean;
import com.app.buffet.bean.data.ItemLimitBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 菜品更新
 * <p/>作者：景阳
 * <p/>创建时间: 2017/9/2 8:49
 */
public class ItemUpdateResponse extends BaseHttpData {

    @SerializedName("imgClassCode")
    private String imgClassCode;

    @SerializedName("imgCode")
    private String imgCode;

    @SerializedName("clearCode")
    private String clearCode;

    @SerializedName("limitCode")
    private String limitCode;

    @SerializedName("imgUpdateList")
    private List<IdBean> imgUpdateList;

    @SerializedName("imgClassUpdateList")
    private List<IdBean> imgClassUpdateList;

    @SerializedName("clearUpdateList")
    private List<ItemClearBean> clearUpdateList;

    @SerializedName("limitUpdateList")
    private List<ItemLimitBean> limitUpdateList;

    public String getImgClassCode() {
        return imgClassCode;
    }

    public void setImgClassCode(String imgClassCode) {
        this.imgClassCode = imgClassCode;
    }

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
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

    public List<IdBean> getImgUpdateList() {
        return imgUpdateList;
    }

    public void setImgUpdateList(List<IdBean> imgUpdateList) {
        this.imgUpdateList = imgUpdateList;
    }

    public List<IdBean> getImgClassUpdateList() {
        return imgClassUpdateList;
    }

    public void setImgClassUpdateList(List<IdBean> imgClassUpdateList) {
        this.imgClassUpdateList = imgClassUpdateList;
    }

    public List<ItemClearBean> getClearUpdateList() {
        return clearUpdateList;
    }

    public void setClearUpdateList(List<ItemClearBean> clearUpdateList) {
        this.clearUpdateList = clearUpdateList;
    }

    public List<ItemLimitBean> getLimitUpdateList() {
        return limitUpdateList;
    }

    public void setLimitUpdateList(List<ItemLimitBean> limitUpdateList) {
        this.limitUpdateList = limitUpdateList;
    }
}
