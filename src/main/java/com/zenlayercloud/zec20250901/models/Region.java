package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 支持售卖 ByoIP CIDR 的区域。
 */
public class Region extends TeaModel {


    /**
     * 支持的网段。
     */
    public Integer netmask;

    /**
     * 支持售卖的区域。
     */
    public String regionId;

    /**
     * 支持的网络类型。
     */
    public String network;

    /**
     * 支持的IP类型。
     */
    public String ipType;

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

}