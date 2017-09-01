package com.app.buffet.bean.data;

/**
 * 描述: 已点品项
 * <p/>作者：景阳
 * <p/>创建时间: 2017/8/28 15:56
 */
public class OrderViewBean extends BaseOrderBean {

    private String name;
    private String sizeName;
    private double singlePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }
}
