package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ReplaceNetworkInterfacePrimaryIpv4Request extends TeaModel {


    /**
     * 需要变更的网卡ID。
     */
    public String nicId;

    /**
     * 变更的目标内网IPv4地址。
     * 该地址必须属于子网的CIDR内，且未被使用。
     * 如果未指定，将自动分配子网内当前可用的最小IP地址。
     */
    public String primaryIpAddress;

    /**
     * 是否在变更成功后自动重启已绑定的运行中实例，使新的主内网IPv4地址在实例内立即生效。
     * 默认为true。
     * 如果网卡未绑定实例、绑定的实例未处于运行中、或本次未产生实际变更（如指定了与当前相同的IP），则不会触发重启。
     */
    public Boolean rebootInstance;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public void setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
    }

    public Boolean getRebootInstance() {
        return this.rebootInstance;
    }

    public void setRebootInstance(Boolean rebootInstance) {
        this.rebootInstance = rebootInstance;
    }

}