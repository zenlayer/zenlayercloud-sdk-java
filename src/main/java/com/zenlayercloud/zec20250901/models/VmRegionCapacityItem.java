package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 节点库存容量信息。
 */
public class VmRegionCapacityItem extends TeaModel {


    /**
     * 节点 ID，格式如 asia-north-1。
     */
    public String regionId;

    /**
     * 该节点整体库存容量级别。
     * 库存容量根据所有机型可售核数定义，不包含内存、存储或其他资源因素。
     */
    public String capacity;

    /**
     * 各实例类型的库存容量明细，不含库存为 0 的条目。
     */
    public List<InstanceTypeCapacityItem> instanceTypes;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public List<InstanceTypeCapacityItem> getInstanceTypes() {
        return this.instanceTypes;
    }

    public void setInstanceTypes(List<InstanceTypeCapacityItem> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

}