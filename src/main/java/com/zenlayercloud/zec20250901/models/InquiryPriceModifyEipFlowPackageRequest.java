package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyEipFlowPackageRequest extends TeaModel {


    /**
     * 要操作的公网弹性IP。
     */
    public String eipId;

    /**
     * 调整后的流量包大小。
     * 单位：TB，为0或0.1的倍数。
     */
    public Double flowPackage;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

}