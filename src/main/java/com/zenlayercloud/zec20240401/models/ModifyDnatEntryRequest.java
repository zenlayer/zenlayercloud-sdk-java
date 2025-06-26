package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class ModifyDnatEntryRequest extends TeaModel {


    /**
     * DNAT规则 ID
     */
    public String dnatEntryId;

    /**
     */
    public String eipId;

    /**
     * DNAT规则的内网IP地址
     */
    public String privateIp;

    /**
     * DNAT规则的协议类型
     */
    public String protocol;

    /**
     * DNAT规则端口转发的外部端口或端口段，取值范围1-65535
     */
    public String listenerPort;

    /**
     * DNAT规则端口转发的内部端口或端口段，取值范围1-65535
     */
    public String internalPort;

    public String getDnatEntryId() {
        return this.dnatEntryId;
    }

    public void setDnatEntryId(String dnatEntryId) {
        this.dnatEntryId = dnatEntryId;
    }

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getPrivateIp() {
        return this.privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getListenerPort() {
        return this.listenerPort;
    }

    public void setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
    }

    public String getInternalPort() {
        return this.internalPort;
    }

    public void setInternalPort(String internalPort) {
        this.internalPort = internalPort;
    }

}