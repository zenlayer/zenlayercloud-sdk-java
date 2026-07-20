package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建二层网络专线时连接点的参数。
 */
public class CreateEndpointParam extends TeaModel {


    /**
     * 数据中心端口 ID。
     * 连接点为数据中心端口时使用。
     */
    public String portId;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * 云地域 ID。
     * 连接点为云连接时使用。
     */
    public String cloudRegionId;

    /**
     * 云账号 ID。
     * 连接点为云连接时使用。
     */
    public String cloudAccountId;

    /**
     * 云连接高可用类型。
     */
    public String haType;

    /**
     * 云连接带宽限制。
     * 单位：Mbps。
     */
    public Integer cloudBandwidthMbps;

    /**
     * 数据中心 ID。
     */
    public String dcId;

    /**
     * 云厂商类型。
     */
    public String cloudType;

    /**
     * 连接点名称。
     * 仅允许字母、数字和连字符。
     */
    public String endpointName;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public void setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
    }

    public String getHaType() {
        return this.haType;
    }

    public void setHaType(String haType) {
        this.haType = haType;
    }

    public Integer getCloudBandwidthMbps() {
        return this.cloudBandwidthMbps;
    }

    public void setCloudBandwidthMbps(Integer cloudBandwidthMbps) {
        this.cloudBandwidthMbps = cloudBandwidthMbps;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getCloudType() {
        return this.cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public String getEndpointName() {
        return this.endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

}