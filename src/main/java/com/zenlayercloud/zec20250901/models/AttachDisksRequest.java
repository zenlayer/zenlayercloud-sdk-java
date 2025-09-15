package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 云硬盘挂在到实例的请求信息。
 */
public class AttachDisksRequest extends TeaModel {


    /**
     * 需要挂载的云硬盘ID列表
     */
    public List<String> diskIds;

    /**
     * 被挂载的实例ID
     */
    public String instanceId;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}