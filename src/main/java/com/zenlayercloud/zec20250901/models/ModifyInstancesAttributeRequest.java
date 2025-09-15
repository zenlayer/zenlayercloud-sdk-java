package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改实例属性（名称）的请求参数。
 */
public class ModifyInstancesAttributeRequest extends TeaModel {


    /**
     * 待修改属性的实例ID列表
     */
    public List<String> instanceIds;

    /**
     * 实例名称。
     * 2～63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    public String instanceName;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

}