package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 三层网络边缘连接点的详细信息。
 */
public class CloudRouterEdgePoint extends TeaModel {


    /**
     * 连接点的 ID。
     */
    public String edgePointId;

    /**
     * 连接点的名称。
     */
    public String edgePointName;

    /**
     * 连接点的连通性状态。
     */
    public String connectivityStatus;

    /**
     * 连接点所在的数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 连接点的类型。
     */
    public String edgePointType;

    /**
     * 云连接点的云厂商类型。
     */
    public String cloudType;

    /**
     * 云连接点的云账号 ID。
     */
    public String cloudAccountId;

    /**
     * 云连接点的云地域 ID。
     */
    public String cloudRegionId;

    /**
     * VPC 连接点的 VPC ID。
     */
    public String vpcId;

    /**
     * ZBG 连接点的 ZBG ID。
     */
    public String zbgId;

    /**
     * ZBG 连接点所属的region。
     */
    public String zbgRegionId;

    /**
     * 数据中心端口连接点的端口 ID。
     */
    public String portId;

    /**
     * 共享通道ID。
     * 公有云接入点对应的云侧连接标识，仅公有云类型接入点时有值。
     */
    public String sharedChannelId;

    /**
     * 连接点的 VLAN ID。
     * 取值范围 2-4000。
     */
    public Integer vlanId;

    /**
     * 连接点的骨干带宽限速。
     * 单位 Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * 连接点的 BGP 连接配置。
     */
    public BGPConnection bgpConnection;

    /**
     * 连接点的静态路由配置。
     */
    public List<IPRoute> staticRoutes;

    /**
     * 连接点的创建时间。
     */
    public String createTime;

    /**
     * 连接点的互联 IP 地址。
     */
    public String ipAddress;

    public String getEdgePointId() {
        return this.edgePointId;
    }

    public void setEdgePointId(String edgePointId) {
        this.edgePointId = edgePointId;
    }

    public String getEdgePointName() {
        return this.edgePointName;
    }

    public void setEdgePointName(String edgePointName) {
        this.edgePointName = edgePointName;
    }

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getEdgePointType() {
        return this.edgePointType;
    }

    public void setEdgePointType(String edgePointType) {
        this.edgePointType = edgePointType;
    }

    public String getCloudType() {
        return this.cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public void setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public String getZbgRegionId() {
        return this.zbgRegionId;
    }

    public void setZbgRegionId(String zbgRegionId) {
        this.zbgRegionId = zbgRegionId;
    }

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getSharedChannelId() {
        return this.sharedChannelId;
    }

    public void setSharedChannelId(String sharedChannelId) {
        this.sharedChannelId = sharedChannelId;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public BGPConnection getBgpConnection() {
        return this.bgpConnection;
    }

    public void setBgpConnection(BGPConnection bgpConnection) {
        this.bgpConnection = bgpConnection;
    }

    public List<IPRoute> getStaticRoutes() {
        return this.staticRoutes;
    }

    public void setStaticRoutes(List<IPRoute> staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}