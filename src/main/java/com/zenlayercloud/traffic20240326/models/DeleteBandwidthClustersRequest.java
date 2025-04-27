package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteBandwidthClustersRequest extends TeaModel {


    /**
     * 共享带宽包ID列表。
     * 最多一次可传20个
     */
    public List<String> bandwidthClusterIds;

    public List<String> getBandwidthClusterIds() {
        return this.bandwidthClusterIds;
    }

    public void setBandwidthClusterIds(List<String> bandwidthClusterIds) {
        this.bandwidthClusterIds = bandwidthClusterIds;
    }

}