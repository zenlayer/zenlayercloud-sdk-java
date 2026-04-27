package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网弹性IP可以绑定的网卡及内网信息
 */
public class PrivateIpInfo extends TeaModel {


    /**
     * 该 vNIC 上已分配的内网 IPv4 地址，可用于与指定 EIP 进行绑定。
     */
    public String lanIp;

    /**
     * 弹性网卡（vNIC）的 ID。
     */
    public String nicId;

    /**
     * 弹性网卡（vNIC）的名称。
     */
    public String nicName;

    /**
     * vNIC 所挂载实例的 ID。
     * 若 vNIC 未挂载至任何实例，则为 null。
     */
    public String instanceId;

    /**
     * vNIC 所挂载实例的名称。
     * 若 vNIC 未挂载至任何实例，则为 null。
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