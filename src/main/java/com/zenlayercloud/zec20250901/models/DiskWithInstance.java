package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 随机器创建的数据盘信息。
 */
public class DiskWithInstance extends TeaModel {


    /**
     * 实例ID
     */
    public String instanceId;

    /**
     * 随机器创建的数据盘ID集合
     */
    public List<String> diskIdSet;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public List<String> getDiskIdSet() {
        return this.diskIdSet;
    }

    public void setDiskIdSet(List<String> diskIdSet) {
        this.diskIdSet = diskIdSet;
    }

}