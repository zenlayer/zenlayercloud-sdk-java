package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteQosPolicyGroupRequest extends TeaModel {


    /**
     * QoS策略组ID。
     * 可通过调用 ~~DescribeQosPolicyGroups~~ 获取。
     */
    public String qosPolicyGroupId;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

}