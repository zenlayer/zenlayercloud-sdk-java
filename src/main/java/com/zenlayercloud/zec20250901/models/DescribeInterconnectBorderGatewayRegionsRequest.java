package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeInterconnectBorderGatewayRegionsRequest extends TeaModel {


    /**
     * 节点ID，用于过滤指定节点。
     */
    public String regionId;

    /**
     * 数据中心UUID，用于过滤指定数据中心。
     */
    public String dcId;

    /**
     * 数据中心代码，用于过滤指定数据中心。
     */
    public String dcCode;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getDcCode() {
        return this.dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
    }

}