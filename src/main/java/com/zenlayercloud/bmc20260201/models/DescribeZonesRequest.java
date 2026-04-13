package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeZonesRequest extends TeaModel {


    /**
     * 接收的区域地域的语言。可选值如下：
     * <ul><li>zh-CN：中文</li><li>en-US：英文</li></ul>默认值：en-US。
     */
    public String acceptLanguage;

    /**
     * 根据可用区是否支持SDN三层网络进行筛选。可选值如下：
     * <ul><li>true：支持</li><li>false：不支持</li></ul>
     */
    public Boolean isCloudRouterAvailable;

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Boolean getIsCloudRouterAvailable() {
        return this.isCloudRouterAvailable;
    }

    public void setIsCloudRouterAvailable(Boolean isCloudRouterAvailable) {
        this.isCloudRouterAvailable = isCloudRouterAvailable;
    }

}