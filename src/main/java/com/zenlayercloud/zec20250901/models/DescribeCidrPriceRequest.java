package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询CIDR价格的请求信息。
 */
public class DescribeCidrPriceRequest extends TeaModel {


    /**
     * 查询CIDR所在的节点ID
     */
    public String regionId;

    /**
     * 查询CIDR的IP线路类型
     */
    public String eipV4Type;

    /**
     * 需要查询的CIDR子网数量和掩码信息
     */
    public NetmaskInfo netmask;

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

    public NetmaskInfo getNetmask() {
        return this.netmask;
    }

    public void setNetmask(NetmaskInfo netmask) {
        this.netmask = netmask;
    }

}