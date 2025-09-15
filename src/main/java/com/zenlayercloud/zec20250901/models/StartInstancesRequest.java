package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 启动虚拟机实例的参数。
 */
public class StartInstancesRequest extends TeaModel {


    /**
     * 要启动的实例ID
     */
    public List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}