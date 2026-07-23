package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ChangeEipInternetChargeTypeRequest extends TeaModel {


    /**
     * 要操作的公网弹性IP。
     */
    public String eipId;

    /**
     * 要变更的目标网络计费类型。
     */
    public String internetChargeType;

    /**
     * 流量包大小。
     * 单位：TB。
     * 网络计费方式为流量包计费（`ByTrafficPackage`）时需指定。
     */
    public Double flowPackage;

    /**
     * 带宽限速。
     * 单位：Mbps。
     * 网络计费方式为按带宽计费（`ByBandwidth`）时需指定。
     */
    public Integer bandwidth;

    /**
     * 带宽峰值上限（Mbps）。
     */
    public Integer bandwidthCap;

    /**
     * 共享带宽包ID。
     * 变更为共享带宽包计费时需指定。
     */
    public String clusterId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getBandwidthCap() {
        return this.bandwidthCap;
    }

    public void setBandwidthCap(Integer bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

}