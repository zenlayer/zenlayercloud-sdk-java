package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateRouteRequest extends TeaModel {


    /**
     * VPC的ID
     */
    public String vpcId;

    /**
     * IP类型。
     * 支持`IPv4`和`IPv6`两种类型
     */
    public String ipVersion;

    /**
     * 路由类型
     */
    public String routeType;

    /**
     * 源IP地址。
     * `路由类型`配置`RouteTypePolicy(策略路由)`时需指定
     */
    public String sourceIp;

    /**
     * IPv4或IPv6的目标网段。
     * 例如：10.0.1.0/24
     */
    public String destinationCidrBlock;

    /**
     * 路由优先级。
     * 数值越小，优先级越高
     */
    public Integer priority;

    /**
     * 下一跳资源ID。
     * 目前只支持网卡ID
     */
    public String nextHopId;

    /**
     * 路由名称。
     * 名称长度为 2 到 63 个字符，仅支持字母、数字、连字符 (-) 、下划线(_) 、斜杠(/) 、和句点 (.)，且开头和结尾必须是字母或数字
     */
    public String name;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}