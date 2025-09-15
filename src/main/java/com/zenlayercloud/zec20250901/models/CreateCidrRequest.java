package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建CIDR请求参数
 */
public class CreateCidrRequest extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 公网IPv4的网络类型
     */
    public String eipV4Type;

    /**
     * CIDR掩码、数量
     */
    public NetmaskInfo netmask;

    /**
     * 资源组ID。
     * 如果不指定，则会加入默认资源组
     */
    public String resourceGroupId;

    /**
     * 市场营销相关的选项
     */
    public MarketingInfo marketingOptions;

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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

}