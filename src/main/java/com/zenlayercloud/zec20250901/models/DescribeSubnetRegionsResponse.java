package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询支持创建子网区域的响应信息
 */
public class DescribeSubnetRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 支持子网的节点信息
     */
    public List<RegionInfo> regionSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<RegionInfo> getRegionSet() {
        return this.regionSet;
    }

    public void setRegionSet(List<RegionInfo> regionSet) {
        this.regionSet = regionSet;
    }

}