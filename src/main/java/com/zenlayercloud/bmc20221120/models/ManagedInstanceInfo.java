package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 托管实例信息。
 */
public class ManagedInstanceInfo extends TeaModel {


    /**
     * 实例ID
     */
    public String instanceId;

    /**
     * 实例名称
     */
    public String instanceName;

    /**
     * 地域名称
     */
    public String facName;

    /**
     * 公网IP列表
     */
    public List<String> ips;

    /**
     * 内网IP列表
     */
    public List<String> lanIps;

    /**
     * 创建时间
     */
    public String createTime;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getFacName() {
        return this.facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public List<String> getIps() {
        return this.ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public List<String> getLanIps() {
        return this.lanIps;
    }

    public void setLanIps(List<String> lanIps) {
        this.lanIps = lanIps;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}