package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class RebootInstancesRequest extends TeaModel {


    /**
     * 待重启虚拟机实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * 是否强制重启。
     */
    public Boolean forceReboot;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    public void setForceReboot(Boolean forceReboot) {
        this.forceReboot = forceReboot;
    }

}