package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改防护策略请求参数
 */
public class ModifyPolicyRequest extends TeaModel {


    /**
     * 防护策略ID
     */
    public String policyId;

    /**
     * 防护策略名称。
     * 2～63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    public String policyName;

    /**
     * 配置类型
     */
    public String configType;

    /**
     * 黑名单列表
     */
    public List<String> blackIpList;

    /**
     * 白名单列表
     */
    public List<String> whiteIpList;

    /**
     * 黑名单超时时间, 单位:分钟
     */
    public Integer ipBlackTimeout;

    /**
     * 端口封禁
     */
    public List<DdosPolicyPort> ports;

    /**
     * 开启的封禁协议。
     * 不能同时开启UDP和TCP
     */
    public List<String> blockProtocol;

    /**
     * 封禁的区域
     */
    public List<String> blockRegions;

    /**
     * 指纹过滤相关配置
     */
    public List<DdosFingerprintRule> finger;

    /**
     * 反射攻击防护过滤的端口列表
     */
    public List<DdosReflectUdpPort> reflectUdpPort;

    /**
     * 源限速配置
     */
    public DdosTrafficControl trafficControl;

    /**
     * 创建DDoS时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

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

    public String getConfigType() {
        return this.configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public List<String> getBlackIpList() {
        return this.blackIpList;
    }

    public void setBlackIpList(List<String> blackIpList) {
        this.blackIpList = blackIpList;
    }

    public List<String> getWhiteIpList() {
        return this.whiteIpList;
    }

    public void setWhiteIpList(List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
    }

    public Integer getIpBlackTimeout() {
        return this.ipBlackTimeout;
    }

    public void setIpBlackTimeout(Integer ipBlackTimeout) {
        this.ipBlackTimeout = ipBlackTimeout;
    }

    public List<DdosPolicyPort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<DdosPolicyPort> ports) {
        this.ports = ports;
    }

    public List<String> getBlockProtocol() {
        return this.blockProtocol;
    }

    public void setBlockProtocol(List<String> blockProtocol) {
        this.blockProtocol = blockProtocol;
    }

    public List<String> getBlockRegions() {
        return this.blockRegions;
    }

    public void setBlockRegions(List<String> blockRegions) {
        this.blockRegions = blockRegions;
    }

    public List<DdosFingerprintRule> getFinger() {
        return this.finger;
    }

    public void setFinger(List<DdosFingerprintRule> finger) {
        this.finger = finger;
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

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}