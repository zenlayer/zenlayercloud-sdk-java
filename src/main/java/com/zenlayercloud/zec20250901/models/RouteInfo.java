package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述路由的相关信息。
 */
public class RouteInfo extends TeaModel {


    /**
     * 路由ID
     */
    public String routeId;

    /**
     * 路由的名称
     */
    public String name;

    /**
     * 路由关联的VPC的ID
     */
    public String vpcId;

    /**
     * 路由关联的VPC的名称
     */
    public String vpcName;

    /**
     * IP类型。
     * 支持`IPv4`和`IPv6`两种类型
     */
    public String ipVersion;

    /**
     * 路由类型
     */
    public String type;

    /**
     * 源IP地址。
     * 当`路由类型`是`RouteTypePolicy(策略路由)`时可取值
     */
    public String sourceIp;

    /**
     * IPv4或IPv6的目标网段。
     * 例如：10.0.1.0/24
     */
    public String destinationCidrBlock;

    /**
     * 路由优先级
     */
    public Integer priority;

    /**
     * 下一跳资源ID
     */
    public String nextHopId;

    /**
     * 下一跳资源名称
     */
    public String nextHopName;

    /**
     * 下一跳的类型
     */
    public String nextHopType;

    /**
     * 路由的创建时间
     */
    public String createTime;

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSourceIp() {
        return this.sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getNextHopId() {
        return this.nextHopId;
    }

    public void setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
    }

    public String getNextHopName() {
        return this.nextHopName;
    }

    public void setNextHopName(String nextHopName) {
        this.nextHopName = nextHopName;
    }

    public String getNextHopType() {
        return this.nextHopType;
    }

    public void setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}