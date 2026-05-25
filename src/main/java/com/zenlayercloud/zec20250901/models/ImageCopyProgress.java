package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述自定义镜像在单个目标区域的复制进度。
 */
public class ImageCopyProgress extends TeaModel {


    /**
     * 目标区域 ID。
     */
    public String destRegionId;

    /**
     * 目标区域名称。
     */
    public String destRegionName;

    /**
     * 复制阶段。
     */
    public String syncStage;

    /**
     * 是否处于排队等待中，传输任务正在等待系统调度执行。
     */
    public Boolean queued;

    /**
     * 复制进度百分比，保留2位小数（如74.23）。
     */
    public Double syncPercent;

    /**
     * 该目标区域复制异常或失败时返回的错误信息。
     */
    public String errorInfo;

    public String getDestRegionId() {
        return this.destRegionId;
    }

    public void setDestRegionId(String destRegionId) {
        this.destRegionId = destRegionId;
    }

    public String getDestRegionName() {
        return this.destRegionName;
    }

    public void setDestRegionName(String destRegionName) {
        this.destRegionName = destRegionName;
    }

    public String getSyncStage() {
        return this.syncStage;
    }

    public void setSyncStage(String syncStage) {
        this.syncStage = syncStage;
    }

    public Boolean getQueued() {
        return this.queued;
    }

    public void setQueued(Boolean queued) {
        this.queued = queued;
    }

    public Double getSyncPercent() {
        return this.syncPercent;
    }

    public void setSyncPercent(Double syncPercent) {
        this.syncPercent = syncPercent;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

}