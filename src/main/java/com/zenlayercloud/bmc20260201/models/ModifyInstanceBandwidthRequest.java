package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class ModifyInstanceBandwidthRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    /**
     * 带宽。
     * 范围：1~机型最大。
     */
    public Integer bandwidthOutMbps;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getBandwidthOutMbps() {
        return this.bandwidthOutMbps;
    }

    public void setBandwidthOutMbps(Integer bandwidthOutMbps) {
        this.bandwidthOutMbps = bandwidthOutMbps;
    }

}