package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 二层网络专线连接点的详细信息。
 */
public class PrivateConnectEndpoint extends TeaModel {


    /**
     * 连接点 ID。
     */
    public String endpointId;

    /**
     * 连接点名称。
     */
    public String endpointName;

    /**
     * 连接点类型。
     */
    public String endpointType;

    /**
     * 连通性状态。
     */
    public String connectivityStatus;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * 数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 云地域 ID。
     * 连接点为云连接时返回。
     */
    public String cloudRegionId;

    /**
     * 云账号 ID。
     * 连接点为云连接时返回。
     */
    public String cloudAccountId;

    /**
     * 共享通道ID。
     * 公有云接入点对应的云侧连接标识，仅公有云类型接入点时有值。
     */
    public String sharedChannelId;

    public String getEndpointId() {
        return this.endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public String getEndpointName() {
        return this.endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public String getEndpointType() {
        return this.endpointType;
    }

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
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

    public String getSharedChannelId() {
        return this.sharedChannelId;
    }

    public void setSharedChannelId(String sharedChannelId) {
        this.sharedChannelId = sharedChannelId;
    }

}