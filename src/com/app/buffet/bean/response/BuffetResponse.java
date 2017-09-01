package com.app.buffet.bean.response;

import com.google.gson.annotations.SerializedName;

/**
 * 描述: 通用返回字段
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 9:19
 */
public class BuffetResponse<T> {

    @SerializedName("result")
    private int result;

    @SerializedName("msg")
    private String msg;

    @SerializedName("errorCode")
    private int errorCode;

    @SerializedName("data")
    private T data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
