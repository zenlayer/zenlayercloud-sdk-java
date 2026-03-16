package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * BYOIP 询价单项。
 */
public class ByoipPriceItem extends TeaModel {


    /**
     * 宣告ip段。
     */
    public String cidrBlock;

    /**
     * 线路类型。
     */
    public String networkType;

    /**
     * 区域id。
     */
    public String regionId;

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}