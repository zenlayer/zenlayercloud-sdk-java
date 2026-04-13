package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class ModifyInstanceTrafficPackageRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    /**
     * 流量包大小。
     * 必须是0.05的倍数。
     */
    public Double trafficPackageSize;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

}