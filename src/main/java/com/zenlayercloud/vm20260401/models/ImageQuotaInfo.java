package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 镜像的配额信息。
 */
public class ImageQuotaInfo extends TeaModel {


    /**
     * 支持创建镜像的区域。
     */
    public String zoneId;

    /**
     * 当前已配置镜像数。
     */
    public Integer count;

    /**
     * 本区域可配置的最大镜像数。
     */
    public Integer maxCount;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMaxCount() {
        return this.maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

}