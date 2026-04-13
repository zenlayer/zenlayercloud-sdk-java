package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 进行自定义Raid配置时需要的raid级别和指定的磁盘序号。
 */
public class CustomRaid extends TeaModel {


    /**
     * Raid类型。
     * 支持0, 1, 5, 10。
     */
    public Integer raidType;

    /**
     * 磁盘序号。
     * 根据机型里的磁盘从1开始顺序编号。如果是多个磁盘序号，则必须连续。
     */
    public List<Integer> diskSequence;

    public Integer getRaidType() {
        return this.raidType;
    }

    public void setRaidType(Integer raidType) {
        this.raidType = raidType;
    }

    public List<Integer> getDiskSequence() {
        return this.diskSequence;
    }

    public void setDiskSequence(List<Integer> diskSequence) {
        this.diskSequence = diskSequence;
    }

}