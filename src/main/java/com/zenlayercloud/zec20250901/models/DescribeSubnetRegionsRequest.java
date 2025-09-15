package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询支持创建子网区域的请求信息。
 */
public class DescribeSubnetRegionsRequest extends TeaModel {


    /**
     * 根据节点ID过滤
     */
    public List<String> regionIds;

    public List<String> getRegionIds() {
        return this.regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

}