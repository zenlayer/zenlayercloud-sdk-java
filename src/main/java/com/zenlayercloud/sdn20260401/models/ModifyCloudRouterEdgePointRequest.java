package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyCloudRouterEdgePointRequest extends TeaModel {


    /**
     * 连接点关联的三层网络 ID。
     */
    public String cloudRouterId;

    /**
     * 三层网络连接点的 ID。
     */
    public String edgePointId;

    /**
     * 需要修改的带宽限速。
     * 单位 Mbps，取值范围 1-500。
     */
    public Integer bandwidthMbps;

    /**
     * 连接点的互联 IP 地址。
     */
    public String ipAddress;

    /**
     * BGP 连接配置。
     * 与静态路由二选一。
     */
    public BGPConnection bgpConnection;

    /**
     * 静态路由配置。
     * 与 BGP 连接二选一。
     */
    public List<IPRoute> staticRoutes;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

    public String getEdgePointId() {
        return this.edgePointId;
    }

    public void setEdgePointId(String edgePointId) {
        this.edgePointId = edgePointId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
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

}