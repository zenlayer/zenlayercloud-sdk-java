package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyInstancesAttributeRequest extends TeaModel {


    /**
     * 实例名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String instanceName;

    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。每次请求批量实例的上限为100。
     */
    public List<String> instanceIds;

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}