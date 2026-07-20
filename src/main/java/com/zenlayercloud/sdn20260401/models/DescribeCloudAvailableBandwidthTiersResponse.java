package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCloudAvailableBandwidthTiersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 云连接可用的带宽阶梯列表。
     */
    public List<Integer> availableBandwidthTiers;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Integer> getAvailableBandwidthTiers() {
        return this.availableBandwidthTiers;
    }

    public void setAvailableBandwidthTiers(List<Integer> availableBandwidthTiers) {
        this.availableBandwidthTiers = availableBandwidthTiers;
    }

}