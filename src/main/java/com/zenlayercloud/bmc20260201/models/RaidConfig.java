package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 实例磁盘阵列配置， 包括自定义raid的配置。
 */
public class RaidConfig extends TeaModel {


    /**
     * Raid类型。
     * 该配置进行快捷raid配置，支持0, 1, 5, 10。
     * raidType和customRaids只能指定其中一个参数。
     */
    public Integer raidType;

    /**
     * 自定义Raid配置。
     * 自定义磁盘进行raid的配置。
     * raidType和customRaids只能指定其中一个参数。
     */
    public List<CustomRaid> customRaids;

    public Integer getRaidType() {
        return this.raidType;
    }

    public void setRaidType(Integer raidType) {
        this.raidType = raidType;
    }

    public List<CustomRaid> getCustomRaids() {
        return this.customRaids;
    }

    public void setCustomRaids(List<CustomRaid> customRaids) {
        this.customRaids = customRaids;
    }

}