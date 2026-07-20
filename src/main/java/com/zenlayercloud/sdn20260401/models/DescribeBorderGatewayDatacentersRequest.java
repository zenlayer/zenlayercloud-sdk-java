package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeBorderGatewayDatacentersRequest extends TeaModel {


    /**
     * 数据中心 ID。
     */
    public String dcId;

    /**
     * 节点 ID。
     */
    public String regionId;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}