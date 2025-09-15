package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡添加IPv6的请求信息。
 */
public class AssignNetworkInterfaceIpv6Request extends TeaModel {


    /**
     * 要添加IPv6的网卡ID
     */
    public String nicId;

    /**
     * 公网IPv6的网络计费方式。
     * 当子网的堆栈类型包括V6且为公网时，需要指定
     */
    public String internetChargeType;

    /**
     * 公网IPv6的带宽限速。
     * 单位Mbps。
     * 当子网的堆栈类型包括V6且为公网时，需要指定
     */
    public Integer bandwidth;

    /**
     * 公网IPv6的流量包大小。
     * 单位为TB。
     * 值要求为0或0.1的倍数。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是流量计费(`ByTrafficPackage`)需要指定
     */
    public Double packageSize;

    /**
     * 公网IPv6所指定的共享带宽包ID。
     * 当子网的堆栈类型包括V6且为公网时，且网络计费方式是共享带宽包计费(`BandwidthCluster`)需要指定
     */
    public String clusterId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Double getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(Double packageSize) {
        this.packageSize = packageSize;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

}