package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询云硬盘监控指标请求。
 */
public class DescribeDiskMonitorDataRequest extends TeaModel {


    /**
     * 云硬盘唯一标识ID
     */
    public String diskId;

    /**
     * 云硬盘监控指标类型
     */
    public String metricType;

    /**
     * 查询开始时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ
     */
    public String endTime;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getMetricType() {
        return this.metricType;
    }

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}