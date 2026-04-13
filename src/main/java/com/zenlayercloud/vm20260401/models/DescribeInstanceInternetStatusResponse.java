package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceInternetStatusResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 虚拟机实例ID。
     */
    public String instanceId;

    /**
     * 实例的名称。
     */
    public String instanceName;

    /**
     * 当前实例的公网出口带宽大小。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 实例将要修改公网出口带宽大小。
     */
    public Integer modifiedInternetMaxBandwidthOut;

    /**
     * 实例带宽状态。
     * Processing：变更中。
     * Enable：可用。
     * WaitToEnable：下周期变更。
     */
    public String modifiedBandwidthStatus;

    /**
     * 当前实例流量包大小，单位TB。
     */
    public Double trafficPackageSize;

    /**
     * 实例要修改流量包大小，单位TB。
     */
    public Double modifiedTrafficPackageSize;

    /**
     * 实例流量包状态。
     * Processing：变更中。
     * Enable：可用。
     * WaitToEnable：下周期变更。
     */
    public String modifiedTrafficPackageStatus;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public Integer getModifiedInternetMaxBandwidthOut() {
        return this.modifiedInternetMaxBandwidthOut;
    }

    public void setModifiedInternetMaxBandwidthOut(Integer modifiedInternetMaxBandwidthOut) {
        this.modifiedInternetMaxBandwidthOut = modifiedInternetMaxBandwidthOut;
    }

    public String getModifiedBandwidthStatus() {
        return this.modifiedBandwidthStatus;
    }

    public void setModifiedBandwidthStatus(String modifiedBandwidthStatus) {
        this.modifiedBandwidthStatus = modifiedBandwidthStatus;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public Double getModifiedTrafficPackageSize() {
        return this.modifiedTrafficPackageSize;
    }

    public void setModifiedTrafficPackageSize(Double modifiedTrafficPackageSize) {
        this.modifiedTrafficPackageSize = modifiedTrafficPackageSize;
    }

    public String getModifiedTrafficPackageStatus() {
        return this.modifiedTrafficPackageStatus;
    }

    public void setModifiedTrafficPackageStatus(String modifiedTrafficPackageStatus) {
        this.modifiedTrafficPackageStatus = modifiedTrafficPackageStatus;
    }

}