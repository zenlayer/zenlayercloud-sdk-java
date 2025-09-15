package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 云硬盘从主机实例上卸载的请求参数。
 */
public class DetachDisksRequest extends TeaModel {


    /**
     * 要卸载的云盘ID列表
     */
    public List<String> diskIds;

    /**
     * 是否检测实例的运行状态。
     * 默认为true，即实例关机才允许被卸载。
     * 否则必须实例关机才能调用本接口
     */
    public Boolean instanceCheckFlag;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public Boolean getInstanceCheckFlag() {
        return this.instanceCheckFlag;
    }

    public void setInstanceCheckFlag(Boolean instanceCheckFlag) {
        this.instanceCheckFlag = instanceCheckFlag;
    }

}