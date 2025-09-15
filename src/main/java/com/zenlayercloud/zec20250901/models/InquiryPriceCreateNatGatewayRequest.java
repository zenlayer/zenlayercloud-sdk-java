package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateNatGatewayRequest extends TeaModel {


    /**
     * 区域节点ID
     */
    public String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}