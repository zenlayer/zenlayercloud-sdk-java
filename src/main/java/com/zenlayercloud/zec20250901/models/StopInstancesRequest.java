package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 关闭虚拟机实例的请求信息。
 */
public class StopInstancesRequest extends TeaModel {


    /**
     * 待关闭的实例ID
     */
    public List<String> instanceIds;

    /**
     * 是否强制关机
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