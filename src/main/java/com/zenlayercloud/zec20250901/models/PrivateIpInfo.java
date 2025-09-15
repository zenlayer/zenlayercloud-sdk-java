package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网弹性IP可以绑定的网卡及内网信息
 */
public class PrivateIpInfo extends TeaModel {


    /**
     * 网卡上的内网IP地址
     */
    public String lanIp;

    /**
     * 网卡ID
     */
    public String nicId;

    /**
     * 网卡的名称
     */
    public String nicName;

    /**
     * 网卡关联的实例ID
     */
    public String instanceId;

    /**
     * 网卡关联的实例名称
     */
    public String instanceName;

    public String getLanIp() {
        return this.lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getNicName() {
        return this.nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

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

}