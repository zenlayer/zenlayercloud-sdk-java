package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeVmInventoryCapacityRequest extends TeaModel {


    /**
     * 节点ID列表，格式如asia-north-1。
     * 不传则返回全部节点。
     * 可通过调用 ~~DescribeRegions~~ 获取。
     */
    public List<String> regionIds;

    public List<String> getRegionIds() {
        return this.regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

}