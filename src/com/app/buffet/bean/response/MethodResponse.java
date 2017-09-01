package com.app.buffet.bean.response;

import com.app.buffet.bean.data.BaseHttpData;
import com.app.buffet.bean.data.MethodBean;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 描述: 做法表
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:27
 */
public class MethodResponse extends BaseHttpData {

    @SerializedName("methodList")
    private List<MethodBean> methodList;

    public List<MethodBean> getMethodList() {
        return methodList;
    }

    public void setMethodList(List<MethodBean> methodList) {
        this.methodList = methodList;
    }
}
