package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 攻击事件的信息。
 */
public class AttackEventInfo extends TeaModel {


    /**
     * 攻击事件唯一ID
     */
    public String eventId;

    /**
     * 攻击状态
     */
    public String status;

    /**
     * 被攻击的IP
     */
    public String ipAddress;

    /**
     * IP是否正在防护中
     */
    public Boolean protecting;

    /**
     * 攻击开始时间
     */
    public String startTime;

    /**
     * 攻击结束时间
     */
    public String endTime;

    /**
     * 从黑洞解封时间
     */
    public String endBlackholeTime;

    /**
     * 攻击峰值流量。
     * 单位bps
     */
    public Double attackBandwidthMax;

    /**
     * 攻击峰值包量。
     * 单位pps
     */
    public Double attackPackageMax;

    /**
     * 事件发生所在区域ID
     */
    public String regionId;

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getProtecting() {
        return this.protecting;
    }

    public void setProtecting(Boolean protecting) {
        this.protecting = protecting;
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

    public String getEndBlackholeTime() {
        return this.endBlackholeTime;
    }

    public void setEndBlackholeTime(String endBlackholeTime) {
        this.endBlackholeTime = endBlackholeTime;
    }

    public Double getAttackBandwidthMax() {
        return this.attackBandwidthMax;
    }

    public void setAttackBandwidthMax(Double attackBandwidthMax) {
        this.attackBandwidthMax = attackBandwidthMax;
    }

    public Double getAttackPackageMax() {
        return this.attackPackageMax;
    }

    public void setAttackPackageMax(Double attackPackageMax) {
        this.attackPackageMax = attackPackageMax;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}