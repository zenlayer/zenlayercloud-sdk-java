package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 随机器创建的数据盘信息。
 */
public class DiskWithInstance extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 随机器创建的数据盘ID集合。
     * 不包含本地盘。
     */
    public List<String> diskIdSet;

    /**
     * 随机器创建的本地盘ID集合。
     * 如果请求中没有指定本地盘，返回空数组。
     */
    public List<String> localDiskIdSet;

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

    public List<String> getLocalDiskIdSet() {
        return this.localDiskIdSet;
    }

    public void setLocalDiskIdSet(List<String> localDiskIdSet) {
        this.localDiskIdSet = localDiskIdSet;
    }

}