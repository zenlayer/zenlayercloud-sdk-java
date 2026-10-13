package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DetachDisksRequest extends TeaModel {


    /**
     * 要卸载的云盘ID列表。
     * 可通过调用 ~~DescribeDisks~~ 获取。
     */
    public List<String> diskIds;

    /**
     * 是否检测实例的运行状态。
     * 开启时，云硬盘所挂载的实例必须已关机才允许卸载；关闭时，不检测实例状态。
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