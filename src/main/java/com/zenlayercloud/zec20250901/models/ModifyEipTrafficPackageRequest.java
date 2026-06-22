package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyEipTrafficPackageRequest extends TeaModel {


    /**
     * EIP唯一标识ID。
     */
    public String eipId;

    /**
     * 流量包大小，单位TB。
     */
    public Double trafficPackageSize;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

}