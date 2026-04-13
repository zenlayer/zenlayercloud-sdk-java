package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceInstanceTrafficPackageRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     */
    public String instanceId;

    /**
     * 流量包大小。
     */
    public Double trafficPackageSize;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

}