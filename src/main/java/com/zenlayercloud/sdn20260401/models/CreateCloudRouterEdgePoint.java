package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建三层网络边缘连接点的配置信息。
 */
public class CreateCloudRouterEdgePoint extends TeaModel {


    /**
     * 连接点的名称。
     * 仅支持字母、数字和短横线，长度不超过 100 字符。
     */
    public String edgePointName;

    /**
     * VPC 连接点的 VPC ID。
     */
    public String vpcId;

    /**
     * ZBG 连接点的 ZBG ID。
     */
    public String zbgId;

    /**
     * 数据中心端口连接点的端口 ID。
     */
    public String portId;

    /**
     * 云连接点的云厂商类型。
     */
    public String cloudType;

    /**
     * 云连接点的云账号 ID。
     */
    public String cloudAccountId;

    /**
     * 连接点所在的数据中心 ID。
     */
    public String dcId;

    /**
     * 云连接点的云地域 ID。
     */
    public String cloudRegionId;

    /**
     * 云连接点的高可用类型。
     */
    public String haType;

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
     * 云连接点的云侧带宽限速。
     * 单位 Mbps。
     */
    public Integer cloudBandwidthMbps;

    /**
     * 连接点的互联 IP 地址及掩码。
     */
    public String ipAddress;

    /**
     * 连接点的 BGP 连接配置。
     * 与静态路由二选一。
     */
    public BGPConnection bgpConnection;

    /**
     * 连接点的静态路由配置。
     * 与 BGP 连接二选一。
     */
    public List<IPRoute> staticRoutes;

    /**
     * IPSec 隧道类型。
     * 取值 FQDN 或 RemoteIP。
     */
    public String ipSecTunnel;

    /**
     * IPSec 客户侧公网 IP 地址。
     */
    public String customerPublicIP;

    /**
     * IPSec 客户侧私网 IP 地址。
     */
    public String customerPrivateIP;

    /**
     * IPSec Virtual Edge 侧私网 IP 地址。
     */
    public String virtualEdgePrivateIP;

    /**
     * IPSec 预共享密钥（PSK）。
     */
    public String psk;

    /**
     * 是否开启健康检查。
     * 默认不开启。
     */
    public Boolean enableHealthCheck;

    /**
     * IPSec 备份隧道配置。
     */
    public BackupIPSecConfig backupIpSec;

    /**
     * IPSec 的 BGP 连接配置。
     * 与 IPSec 静态路由二选一。
     */
    public IPSecBGPConnection ipSecBgpConnection;

    /**
     * IPSec 的静态路由配置。
     * 与 IPSec BGP 连接二选一。
     */
    public List<IPSecStaticRoute> ipSecStaticRoutes;

    public String getEdgePointName() {
        return this.edgePointName;
    }

    public void setEdgePointName(String edgePointName) {
        this.edgePointName = edgePointName;
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

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
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

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

    public String getHaType() {
        return this.haType;
    }

    public void setHaType(String haType) {
        this.haType = haType;
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

    public Integer getCloudBandwidthMbps() {
        return this.cloudBandwidthMbps;
    }

    public void setCloudBandwidthMbps(Integer cloudBandwidthMbps) {
        this.cloudBandwidthMbps = cloudBandwidthMbps;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    public String getIpSecTunnel() {
        return this.ipSecTunnel;
    }

    public void setIpSecTunnel(String ipSecTunnel) {
        this.ipSecTunnel = ipSecTunnel;
    }

    public String getCustomerPublicIP() {
        return this.customerPublicIP;
    }

    public void setCustomerPublicIP(String customerPublicIP) {
        this.customerPublicIP = customerPublicIP;
    }

    public String getCustomerPrivateIP() {
        return this.customerPrivateIP;
    }

    public void setCustomerPrivateIP(String customerPrivateIP) {
        this.customerPrivateIP = customerPrivateIP;
    }

    public String getVirtualEdgePrivateIP() {
        return this.virtualEdgePrivateIP;
    }

    public void setVirtualEdgePrivateIP(String virtualEdgePrivateIP) {
        this.virtualEdgePrivateIP = virtualEdgePrivateIP;
    }

    public String getPsk() {
        return this.psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    public void setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
    }

    public BackupIPSecConfig getBackupIpSec() {
        return this.backupIpSec;
    }

    public void setBackupIpSec(BackupIPSecConfig backupIpSec) {
        this.backupIpSec = backupIpSec;
    }

    public IPSecBGPConnection getIpSecBgpConnection() {
        return this.ipSecBgpConnection;
    }

    public void setIpSecBgpConnection(IPSecBGPConnection ipSecBgpConnection) {
        this.ipSecBgpConnection = ipSecBgpConnection;
    }

    public List<IPSecStaticRoute> getIpSecStaticRoutes() {
        return this.ipSecStaticRoutes;
    }

    public void setIpSecStaticRoutes(List<IPSecStaticRoute> ipSecStaticRoutes) {
        this.ipSecStaticRoutes = ipSecStaticRoutes;
    }

}