package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * QoS策略组成员信息。
 */
public class QosPolicyGroupMember extends TeaModel {


    /**
     * 资源ID（console侧UUID）。
     */
    public String resourceId;

    /**
     * IP类型。
     */
    public String ipType;

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

}