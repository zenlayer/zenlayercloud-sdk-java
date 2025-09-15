package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * EIP绑定的请求信息。
 */
public class AssociateEipAddressRequest extends TeaModel {


    /**
     * 负载均衡实例的ID
     */
    public String loadBalancerId;

    /**
     * 虚拟网卡的ID
     */
    public String nicId;

    /**
     * 要绑定的网卡上的内网IP地址。
     * 当IP绑定的是网卡, 则该字段不能为空
     */
    public String lanIp;

    /**
     * NAT网关的ID
     */
    public String natId;

    /**
     * 要绑定的EIP的ID。
     * EIP 必须是未绑定状态
     */
    public List<String> eipIds;

    /**
     * 绑定类型。
     * 当绑定的是网卡时生效。
     * 默认为普通NAT模式
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

    public String getBindType() {
        return this.bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

}