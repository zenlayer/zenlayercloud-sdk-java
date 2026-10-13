package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AssociateEipAddressRequest extends TeaModel {


    /**
     * 负载均衡实例的ID。
     * 仅`ipStackType`为`IPv4`的负载均衡可绑定弹性IP——负载均衡只支持单栈，`IPv6`的公网地址通过 ~~zlb:AssignLoadBalancerIpv6~~ 接口分配。
     */
    public String loadBalancerId;

    /**
     * 虚拟网卡的ID。
     * 可通过调用 ~~DescribeNetworkInterfaces~~ 获取。
     */
    public String nicId;

    /**
     * 要绑定的网卡上的内网IP地址。
     * 当EIP绑定的是网卡时，该字段不能为空。
     */
    public String lanIp;

    /**
     * NAT网关的ID。
     * 可通过调用 ~~DescribeNatGateways~~ 获取。
     */
    public String natId;

    /**
     * 要绑定的EIP的ID。
     * EIP必须是未绑定状态。
     * 可通过调用 ~~DescribeEips~~ 获取。
     */
    public List<String> eipIds;

    /**
     * 高可用虚拟IP的ID。
     * 可通过调用 ~~DescribeHaVips~~ 获取。
     */
    public String haVipId;

    /**
     * 绑定类型。
     * 当绑定的是网卡时生效。
     */
    public String bindType;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getLanIp() {
        return this.lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public String getNatId() {
        return this.natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getHaVipId() {
        return this.haVipId;
    }

    public void setHaVipId(String haVipId) {
        this.haVipId = haVipId;
    }

    public String getBindType() {
        return this.bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

}