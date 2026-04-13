package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstanceAvailableSecurityGroupResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例可绑定的安全组集合。
     */
    public List<InstanceAvailableSecurityGroup> instanceAvailableSecurityGroups;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceAvailableSecurityGroup> getInstanceAvailableSecurityGroups() {
        return this.instanceAvailableSecurityGroups;
    }

    public void setInstanceAvailableSecurityGroups(List<InstanceAvailableSecurityGroup> instanceAvailableSecurityGroups) {
        this.instanceAvailableSecurityGroups = instanceAvailableSecurityGroups;
    }

}