package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询防护策略详情
 */
public class DescribePolicyDetailResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 防护策略的ID
     */
    public String policyId;

    /**
     * 防护策略的名称
     */
    public String policyName;

    /**
     * 防护对象关联IP列表
     */
    public List<String> attachmentIps;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 黑名单IP列表
     */
    public List<String> blackIps;

    /**
     * 白名单IP列表
     */
    public List<String> whiteIps;

    /**
     * 黑名单超时时间
     */
    public Integer blackIpListExpireAt;

    /**
     * 开启的封禁协议。
     * 不能同时开启UDP和TCP
     */
    public List<String> blockProtocols;

    /**
     * 端口封禁
     */
    public List<DdosPolicyPort> ports;

    /**
     * 封禁的区域
     */
    public List<String> blockRegions;

    /**
     * 反射攻击防护过滤的端口列表
     */
    public List<DdosReflectUdpPort> reflectUdpPort;

    /**
     * 源限速配置
     */
    public DdosTrafficControl trafficControl;

    /**
     * 指纹过滤相关配置
     */
    public List<DdosFingerprintRule> fingerPrintRules;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public List<String> getAttachmentIps() {
        return this.attachmentIps;
    }

    public void setAttachmentIps(List<String> attachmentIps) {
        this.attachmentIps = attachmentIps;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<String> getBlackIps() {
        return this.blackIps;
    }

    public void setBlackIps(List<String> blackIps) {
        this.blackIps = blackIps;
    }

    public List<String> getWhiteIps() {
        return this.whiteIps;
    }

    public void setWhiteIps(List<String> whiteIps) {
        this.whiteIps = whiteIps;
    }

    public Integer getBlackIpListExpireAt() {
        return this.blackIpListExpireAt;
    }

    public void setBlackIpListExpireAt(Integer blackIpListExpireAt) {
        this.blackIpListExpireAt = blackIpListExpireAt;
    }

    public List<String> getBlockProtocols() {
        return this.blockProtocols;
    }

    public void setBlockProtocols(List<String> blockProtocols) {
        this.blockProtocols = blockProtocols;
    }

    public List<DdosPolicyPort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<DdosPolicyPort> ports) {
        this.ports = ports;
    }

    public List<String> getBlockRegions() {
        return this.blockRegions;
    }

    public void setBlockRegions(List<String> blockRegions) {
        this.blockRegions = blockRegions;
    }

    public List<DdosReflectUdpPort> getReflectUdpPort() {
        return this.reflectUdpPort;
    }

    public void setReflectUdpPort(List<DdosReflectUdpPort> reflectUdpPort) {
        this.reflectUdpPort = reflectUdpPort;
    }

    public DdosTrafficControl getTrafficControl() {
        return this.trafficControl;
    }

    public void setTrafficControl(DdosTrafficControl trafficControl) {
        this.trafficControl = trafficControl;
    }

    public List<DdosFingerprintRule> getFingerPrintRules() {
        return this.fingerPrintRules;
    }

    public void setFingerPrintRules(List<DdosFingerprintRule> fingerPrintRules) {
        this.fingerPrintRules = fingerPrintRules;
    }

}