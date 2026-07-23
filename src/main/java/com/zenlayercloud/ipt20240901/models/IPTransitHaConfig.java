package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * IP Transit HA配置信息。
 */
public class IPTransitHaConfig extends TeaModel {


    /**
     * HA 运行模式。
     */
    public String haMode;

    /**
     * 备链路接入数据中心端口 ID。
     * 与顶层 peerPortId 必须同城不同 DC。
     */
    public String secondaryPortId;

    /**
     * 备链路数据中心端口 VLAN ID。
     */
    public Integer secondaryPortVlanId;

    public String getHaMode() {
        return this.haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public String getSecondaryPortId() {
        return this.secondaryPortId;
    }

    public void setSecondaryPortId(String secondaryPortId) {
        this.secondaryPortId = secondaryPortId;
    }

    public Integer getSecondaryPortVlanId() {
        return this.secondaryPortVlanId;
    }

    public void setSecondaryPortVlanId(Integer secondaryPortVlanId) {
        this.secondaryPortVlanId = secondaryPortVlanId;
    }

}