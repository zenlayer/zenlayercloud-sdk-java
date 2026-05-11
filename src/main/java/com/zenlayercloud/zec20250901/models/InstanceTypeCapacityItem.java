package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 实例类型库存容量明细。
 */
public class InstanceTypeCapacityItem extends TeaModel {


    /**
     * CPU 实例类型，如 z2a、z2i、z4a。
     */
    public String instanceType;

    /**
     * GPU 型号，如 z4a.g.C49。
     * 仅 GPU 实例返回此字段。
     */
    public String gpuSpec;

    /**
     * 该实例类型的库存容量级别。
     * 库存容量根据所有机型可售核数定义，不包含内存、存储或其他资源因素。
     */
    public String capacity;

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getGpuSpec() {
        return this.gpuSpec;
    }

    public void setGpuSpec(String gpuSpec) {
        this.gpuSpec = gpuSpec;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}