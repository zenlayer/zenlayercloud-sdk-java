package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeEipNetworkLineTypesRequest extends TeaModel {


    /**
     * 节点ID。
     * 不传则返回所有节点支持的线路类型。
     */
    public String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}