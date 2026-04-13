package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class StopInstancesRequest extends TeaModel {


    /**
     * 一个或多个待操作的实例ID。
     */
    public List<String> instanceIds;

    /**
     * 是否强制关机。
     */
    public Boolean forceShutdown;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public Boolean getForceShutdown() {
        return this.forceShutdown;
    }

    public void setForceShutdown(Boolean forceShutdown) {
        this.forceShutdown = forceShutdown;
    }

}