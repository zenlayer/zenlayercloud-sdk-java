package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 重启虚拟机实例的请求参数。
 */
public class RebootInstancesRequest extends TeaModel {


    /**
     * 待重启虚拟机实例ID列表
     */
    public List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}