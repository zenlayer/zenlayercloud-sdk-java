package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 流量包明细。
 */
public class FlowPackageResponseItem extends TeaModel {


    /**
     * 流量方向类型。
     * LOCAL：境内；INTERNATIONAL：境外；ALL：全部方向。
     */
    public String trafficType;

    /**
     * 该方向的流量包大小，单位 TB。
     */
    public Double flowPackage;

    public String getTrafficType() {
        return this.trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

}