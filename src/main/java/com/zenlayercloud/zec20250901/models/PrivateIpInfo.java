package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网弹性IP可以绑定的网卡及内网信息。
 */
public class PrivateIpInfo extends TeaModel {


    /**
     * 该vNIC上已分配的内网IPv4地址，可用于与指定EIP进行绑定。
     */
    public String lanIp;

    /**
     * 弹性网卡（vNIC）的ID。
     */
    public String nicId;

    /**
     * 弹性网卡（vNIC）的名称。
     */
    public String nicName;

    /**
     * vNIC所挂载实例的ID。
     * 若vNIC未挂载至任何实例，则为null。
     */
    public String instanceId;

    /**
     * vNIC所挂载实例的名称。
     * 若vNIC未挂载至任何实例，则为null。
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