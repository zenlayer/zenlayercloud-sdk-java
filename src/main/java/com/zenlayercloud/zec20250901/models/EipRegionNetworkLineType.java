package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 节点与其支持的IP线路类型映射。
 */
public class EipRegionNetworkLineType extends TeaModel {


    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 该节点支持的IP线路类型列表。
     */
    public List<String> networkLineTypes;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getNetworkLineTypes() {
        return this.networkLineTypes;
    }

    public void setNetworkLineTypes(List<String> networkLineTypes) {
        this.networkLineTypes = networkLineTypes;
    }

}