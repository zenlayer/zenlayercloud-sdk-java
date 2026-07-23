package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * HA 子链路信息。
 */
public class HaLink extends TeaModel {


    /**
     * 当前是否为主线。
     * ACTIVE_STANDBY 模式下动态反映主备切换状态；ACTIVE_ACTIVE 模式下为 null。
     */
    public Boolean isPrimary;

    /**
     * 子链路业务状态。
     */
    public String iptStatus;

    /**
     * 子链路连通性状态。
     */
    public String connectivityStatus;

    /**
     * 所属 VLL ID。
     */
    public String privateConnectId;

    /**
     * 所属 VLL 名称。
     */
    public String privateConnectName;

    /**
     * 对端数据中心端口 ID。
     */
    public String peerPortId;

    /**
     * 对端数据中心端口名称。
     */
    public String peerPortName;

    /**
     * 数据中心端口所在数据中心。
     */
    public DatacenterInfo peerDataCenter;

    /**
     * VLAN ID。
     */
    public Integer peerPortVlan;

    /**
     * 互联 IP 配置。
     */
    public Interconnect interconnect;

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getIptStatus() {
        return this.iptStatus;
    }

    public void setIptStatus(String iptStatus) {
        this.iptStatus = iptStatus;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public String getPrivateConnectId() {
        return this.privateConnectId;
    }

    public void setPrivateConnectId(String privateConnectId) {
        this.privateConnectId = privateConnectId;
    }

    public String getPrivateConnectName() {
        return this.privateConnectName;
    }

    public void setPrivateConnectName(String privateConnectName) {
        this.privateConnectName = privateConnectName;
    }

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
    }

    public String getPeerPortName() {
        return this.peerPortName;
    }

    public void setPeerPortName(String peerPortName) {
        this.peerPortName = peerPortName;
    }

    public DatacenterInfo getPeerDataCenter() {
        return this.peerDataCenter;
    }

    public void setPeerDataCenter(DatacenterInfo peerDataCenter) {
        this.peerDataCenter = peerDataCenter;
    }

    public Integer getPeerPortVlan() {
        return this.peerPortVlan;
    }

    public void setPeerPortVlan(Integer peerPortVlan) {
        this.peerPortVlan = peerPortVlan;
    }

    public Interconnect getInterconnect() {
        return this.interconnect;
    }

    public void setInterconnect(Interconnect interconnect) {
        this.interconnect = interconnect;
    }

}