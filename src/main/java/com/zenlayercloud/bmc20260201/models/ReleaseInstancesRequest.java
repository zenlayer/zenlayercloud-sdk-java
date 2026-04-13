package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ReleaseInstancesRequest extends TeaModel {


    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。每次请求批量实例的上限为100。
     */
    public List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}