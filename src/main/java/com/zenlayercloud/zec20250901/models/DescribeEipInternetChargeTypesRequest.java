package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询EIP支持的IP网络类型的请求信息。
 */
public class DescribeEipInternetChargeTypesRequest extends TeaModel {


    /**
     * 查询的节点ID
     */
    public String regionId;

    /**
     * EIP IP线路类型
     */
    public String eipV4Type;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

}