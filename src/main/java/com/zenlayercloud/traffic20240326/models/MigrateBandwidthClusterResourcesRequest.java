package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 共享带宽包资源迁移的请求对象
 */
public class MigrateBandwidthClusterResourcesRequest extends TeaModel {


    /**
     * 要迁移的目标共享带宽包的ID
     */
    public String targetBandwidthClusterId;

    /**
     * 要迁移的资源的ID列表。
     * 该资源必须属于其他共享带宽包且资源所处的原共享带宽包的`IP网络类型`以及`区域`需要和目标带宽包一致
     */
    public List<String> resourceIdList;

    public String getTargetBandwidthClusterId() {
        return this.targetBandwidthClusterId;
    }

    public void setTargetBandwidthClusterId(String targetBandwidthClusterId) {
        this.targetBandwidthClusterId = targetBandwidthClusterId;
    }

    public List<String> getResourceIdList() {
        return this.resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

}