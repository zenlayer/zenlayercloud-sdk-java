package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AddQosPolicyGroupMembersRequest extends TeaModel {


    /**
     * QoS策略组ID。
     */
    public String qosPolicyGroupId;

    /**
     * 要加入策略组的成员列表。
     */
    public List<QosPolicyGroupMember> members;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

    public List<QosPolicyGroupMember> getMembers() {
        return this.members;
    }

    public void setMembers(List<QosPolicyGroupMember> members) {
        this.members = members;
    }

}