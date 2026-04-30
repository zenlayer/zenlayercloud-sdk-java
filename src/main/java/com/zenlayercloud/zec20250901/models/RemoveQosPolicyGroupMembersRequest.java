package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class RemoveQosPolicyGroupMembersRequest extends TeaModel {


    /**
     * QoS策略组ID。
     */
    public String qosPolicyGroupId;

    /**
     * 要移出策略组的成员资源ID列表。
     * 不传则移除该策略组的全部成员。
     */
    public List<String> resourceIds;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

    public List<String> getResourceIds() {
        return this.resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

}