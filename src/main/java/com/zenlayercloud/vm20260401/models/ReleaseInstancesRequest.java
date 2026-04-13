package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ReleaseInstancesRequest extends TeaModel {


    /**
     * 一个或多个待操作的实例ID。
     */
    public List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}