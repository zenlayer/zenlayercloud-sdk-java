package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 二层网络专线的详细信息。
 */
public class PrivateConnect extends TeaModel {


    /**
     * 二层网络专线 ID。
     */
    public String privateConnectId;

    /**
     * 二层网络专线名称。
     */
    public String privateConnectName;

    /**
     * 连通性状态。
     */
    public String connectivityStatus;

    /**
     * 二层网络专线业务状态。
     */
    public String privateConnectStatus;

    /**
     * 最大带宽限制。
     * 单位：Mbps。
     */
    public Long bandwidthMbps;

    /**
     * 资源组 ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 到期时间。
     */
    public String expiredTime;

    /**
     * 回收时间。
     */
    public String recycledTime;

    /**
     * 二层网络专线一端的连接点（A）。
     */
    public PrivateConnectEndpoint endpointA;

    /**
     * 二层网络专线另一端的连接点（Z）。
     */
    public PrivateConnectEndpoint endpointZ;

    /**
     * 业务来源。
     */
    public String source;

    /**
     * 关联的标签。
     */
    public Tags tags;

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

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public String getPrivateConnectStatus() {
        return this.privateConnectStatus;
    }

    public void setPrivateConnectStatus(String privateConnectStatus) {
        this.privateConnectStatus = privateConnectStatus;
    }

    public Long getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Long bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getRecycledTime() {
        return this.recycledTime;
    }

    public void setRecycledTime(String recycledTime) {
        this.recycledTime = recycledTime;
    }

    public PrivateConnectEndpoint getEndpointA() {
        return this.endpointA;
    }

    public void setEndpointA(PrivateConnectEndpoint endpointA) {
        this.endpointA = endpointA;
    }

    public PrivateConnectEndpoint getEndpointZ() {
        return this.endpointZ;
    }

    public void setEndpointZ(PrivateConnectEndpoint endpointZ) {
        this.endpointZ = endpointZ;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}