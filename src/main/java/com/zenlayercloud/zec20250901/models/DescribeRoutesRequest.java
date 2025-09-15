package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeRoutesRequest extends TeaModel {


    /**
     * 根据路由ID过滤。
     * 最多同时传入100个ID
     */
    public List<String> routeIds;

    /**
     * 根据路由关联的VPC ID过滤
     */
    public String vpcId;

    /**
     * 根据IP类型过滤。
     * 支持`IPv4`和`IPv6`两种类型
     */
    public String ipVersion;

    /**
     * 根据路由类型过滤
     */
    public String routeType;

    /**
     * 根据名称类型过滤。
     * 该字段支持模糊搜索
     */
    public String name;

    /**
     * 根据Ipv4或IPv6的目标网段过滤。
     * 例如：10.0.1.0/24
     */
    public String destinationCidrBlock;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    public List<String> getRouteIds() {
        return this.routeIds;
    }

    public void setRouteIds(List<String> routeIds) {
        this.routeIds = routeIds;
    }

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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}