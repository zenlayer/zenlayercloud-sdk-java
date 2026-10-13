package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceCreateNatGatewayRequest extends TeaModel {


    /**
     * 区域节点ID。
     * 可通过调用 ~~DescribeRegions~~ 获取。
     */
    public String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}