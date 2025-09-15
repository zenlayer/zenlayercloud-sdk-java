package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 释放实例请求参数。
 */
public class ReleaseInstancesRequest extends TeaModel {


    /**
     * 要释放的实例ID列表
     */
    public List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}