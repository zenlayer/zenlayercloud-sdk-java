package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 边界网关互联节点信息。
 */
public class InterconnectRegion extends TeaModel {


    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 节点名称。
     */
    public String name;

    /**
     * 关联的数据中心信息。
     */
    public InterconnectDataCenter dataCenter;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterconnectDataCenter getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(InterconnectDataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }

}