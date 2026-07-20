package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述数据中心端口的详细信息。
 */
public class PortInfo extends TeaModel {


    /**
     * 数据中心端口 ID。
     */
    public String portId;

    /**
     * 数据中心端口名称。
     */
    public String portName;

    /**
     * 数据中心端口备注信息。
     */
    public String portRemarks;

    /**
     * 数据中心端口规格。
     */
    public String portType;

    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 数据中心名称。
     */
    public String dcName;

    /**
     * 城市名称。
     */
    public String cityName;

    /**
     * 所在大区名称。
     */
    public String areaName;

    /**
     * 商业实体名称。
     * 用于 LOA 抬头。
     */
    public String businessEntityName;

    /**
     * 数据中心端口连接状态。
     */
    public String connectionStatus;

    /**
     * 数据中心端口业务状态。
     */
    public String portStatus;

    /**
     * LOA 状态。
     */
    public String loaStatus;

    /**
     * LOA 下载地址。
     */
    public String loaDownloadUrl;

    /**
     * 创建时间。
     */
    public String createdTime;

    /**
     * 到期时间。
     */
    public String expiredTime;

    /**
     * 购买时长。
     * 单位月。
     */
    public Integer period;

    /**
     * 是否允许在该数据中心端口上开通业务。
     */
    public Boolean isCreateBusinessAllowed;

    /**
     * 数据中心端口关联的标签。
     */
    public Tags tags;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortRemarks() {
        return this.portRemarks;
    }

    public void setPortRemarks(String portRemarks) {
        this.portRemarks = portRemarks;
    }

    public String getPortType() {
        return this.portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getDcName() {
        return this.dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getBusinessEntityName() {
        return this.businessEntityName;
    }

    public void setBusinessEntityName(String businessEntityName) {
        this.businessEntityName = businessEntityName;
    }

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getPortStatus() {
        return this.portStatus;
    }

    public void setPortStatus(String portStatus) {
        this.portStatus = portStatus;
    }

    public String getLoaStatus() {
        return this.loaStatus;
    }

    public void setLoaStatus(String loaStatus) {
        this.loaStatus = loaStatus;
    }

    public String getLoaDownloadUrl() {
        return this.loaDownloadUrl;
    }

    public void setLoaDownloadUrl(String loaDownloadUrl) {
        this.loaDownloadUrl = loaDownloadUrl;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Boolean getIsCreateBusinessAllowed() {
        return this.isCreateBusinessAllowed;
    }

    public void setIsCreateBusinessAllowed(Boolean isCreateBusinessAllowed) {
        this.isCreateBusinessAllowed = isCreateBusinessAllowed;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}