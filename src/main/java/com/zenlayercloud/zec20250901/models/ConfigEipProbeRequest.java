package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ConfigEipProbeRequest extends TeaModel {


    /**
     * 要更换绑定模式的EIP ID
     */
    public String eipId;

    /**
     * 是否禁用ICMP
     */
    public Boolean disableIcmp;

    /**
     * TCP探测端口, [1-65535]。
     * 不传表示不开启
     */
    public Integer tcpPort;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Boolean getDisableIcmp() {
        return this.disableIcmp;
    }

    public void setDisableIcmp(Boolean disableIcmp) {
        this.disableIcmp = disableIcmp;
    }

    public Integer getTcpPort() {
        return this.tcpPort;
    }

    public void setTcpPort(Integer tcpPort) {
        this.tcpPort = tcpPort;
    }

}