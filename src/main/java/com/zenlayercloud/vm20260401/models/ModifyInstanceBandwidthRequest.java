package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ModifyInstanceBandwidthRequest extends TeaModel {


    /**
     * 待操作的实例ID。
     */
    public String instanceId;

    /**
     * 出口带宽大小。
     */
    public Integer internetMaxBandwidthOut;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

}