package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateDnatEntryRequest extends TeaModel {


    /**
     * NAT网关 ID
     */
    public String natGatewayId;

    /**
     * DNAT规则添加的弹性公网ID
     */
    public String eipId;

    /**
     * DNAT规则的内网IP地址
     */
    public String privateIp;

    /**
     * DNAT规则的协议类型。
     * 如果要转发所有流量，端口不变，请指定协议类型为`Any`且内部端口和公网外部端口不要设置
     */
    public String protocol;

    /**
     * DNAT规则端口转发的外部公网端口或端口段。
     * 可使用连字符（-）指定端口范围，例如：80-100，公网和内网端口数量需保持一致。
     * 取值范围1-65535。
     * 仅在协议类型不为`Any`时生效
     */
    public String listenerPort;

    /**
     * DNAT规则端口转发的内部端口或端口段。
     * 可使用连字符（-）指定端口范围，例如：80-100，公网和内网端口数量需保持一致。
     * 取值范围1-65535。
     * 仅在协议类型不为`Any`时生效
     */
    public String internalPort;

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
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