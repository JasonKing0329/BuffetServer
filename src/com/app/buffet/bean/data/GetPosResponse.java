package com.app.buffet.bean.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: pos
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:36
 */
public class GetPosResponse extends BaseHttpData {

    @SerializedName("posList")
    private List<PosBean> posList;

    public List<PosBean> getPosList() {
        return posList;
    }

    public void setPosList(List<PosBean> posList) {
        this.posList = posList;
    }
}
