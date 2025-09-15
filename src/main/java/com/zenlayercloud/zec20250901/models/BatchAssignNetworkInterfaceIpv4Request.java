package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class BatchAssignNetworkInterfaceIpv4Request extends TeaModel {


    /**
     * 要操作的网卡ID
     */
    public String nicId;

    /**
     * 内网IP地址列表。
     * IP地址必须在网卡所属子网CIDR范围内，且不能是网关/广播/网络地址
     */
    public List<String> ipAddresses;

    /**
     * 指定额外绑定的内网IP数量。
     * 该字段和`ipAddresses`必须指定其一，如果都指定，则会以 `ipAddresses` 有效
     */
    public Integer ipAddressCount;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public Integer getIpAddressCount() {
        return this.ipAddressCount;
    }

    public void setIpAddressCount(Integer ipAddressCount) {
        this.ipAddressCount = ipAddressCount;
    }

}