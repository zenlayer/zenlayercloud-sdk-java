package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeEipInternetChargeTypesRequest extends TeaModel {


    /**
     * 查询的节点ID。
     */
    public String regionId;

    /**
     * EIP IP线路类型。
     * 已废弃，请使用`networkLineType`。
     */
    @Deprecated
    public String eipV4Type;

    /**
     * EIP IP线路类型。
     */
    public String networkLineType;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Deprecated
    public String getEipV4Type() {
        return this.eipV4Type;
    }

    @Deprecated
    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

}