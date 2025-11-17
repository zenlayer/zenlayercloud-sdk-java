package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 攻击事件详情。
 */
public class DescribeDDosEventDetailResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 攻击事件唯一ID
     */
    public String eventId;

    /**
     * 攻击状态
     */
    public String status;

    /**
     * 攻击类型
     */
    public String type;

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
     * 攻击带宽峰值。
     * 单位bps
     */
    public Double attackBandwidthMax;

    /**
     * 防护带宽峰值。
     * 单位bps
     */
    public Double protectedBandwidthMax;

    /**
     * 攻击峰值包速率。
     * 单位pps
     */
    public Double attackPackageMax;

    /**
     * 防护峰值包速率。
     * 单位pps
     */
    public Double protectedPackageMax;

    /**
     * 攻击来源IP
     */
    public List<String> sourceIp;

    /**
     * 攻击来源端口
     */
    public List<TopPort> sourcePort;

    /**
     * 攻击目标端口
     */
    public List<TopPort> desertionPort;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Double getProtectedBandwidthMax() {
        return this.protectedBandwidthMax;
    }

    public void setProtectedBandwidthMax(Double protectedBandwidthMax) {
        this.protectedBandwidthMax = protectedBandwidthMax;
    }

    public Double getAttackPackageMax() {
        return this.attackPackageMax;
    }

    public void setAttackPackageMax(Double attackPackageMax) {
        this.attackPackageMax = attackPackageMax;
    }

    public Double getProtectedPackageMax() {
        return this.protectedPackageMax;
    }

    public void setProtectedPackageMax(Double protectedPackageMax) {
        this.protectedPackageMax = protectedPackageMax;
    }

    public List<String> getSourceIp() {
        return this.sourceIp;
    }

    public void setSourceIp(List<String> sourceIp) {
        this.sourceIp = sourceIp;
    }

    public List<TopPort> getSourcePort() {
        return this.sourcePort;
    }

    public void setSourcePort(List<TopPort> sourcePort) {
        this.sourcePort = sourcePort;
    }

    public List<TopPort> getDesertionPort() {
        return this.desertionPort;
    }

    public void setDesertionPort(List<TopPort> desertionPort) {
        this.desertionPort = desertionPort;
    }

}