package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * LoadBalancerInfo 信息
 */
public class LoadBalancerInfo extends TeaModel {


    /**
     * LoadBalancerId唯一ID。
     */
    public String loadBalancerId;

    /**
     * LoadBalancer所属的可用区ID。
     */
    public String zoneId;

    /**
     * LoadBalancer的名称。
     */
    public String loadBalancerName;

    /**
     * 规格名称。
     */
    public String specName;

    /**
     * LoadBalancer的VIP集合。
     */
    public List<LoadBalancerIp> vipList;

    /**
     * 计费方式。
     */
    public String chargeType;

    /**
     * 周期。
     */
    public Integer period;

    /**
     * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-ddTHH:mm:ssZ`。
     */
    public String createTime;

    /**
     * 过期时间。
     */
    public String expiredTime;

    /**
     * LoadBalancer的状态。
     */
    public String status;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 主IP。
     */
    public String masterIp;

    /**
     * 备IP。
     */
    public String backupIp;

    /**
     * IPv4。
     */
    public String ipType;

    /**
     * 带宽。
     */
    public Integer bandwidth;

    /**
     * 是否工作。
     */
    public Boolean isWorking;

    /**
     * 监听器集合。
     */
    public List<ListenerInfo> listenerList;

    /**
     * 后端服务器集合。
     */
    public List<BackendInfo> backendList;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public String getSpecName() {
        return this.specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public List<LoadBalancerIp> getVipList() {
        return this.vipList;
    }

    public void setVipList(List<LoadBalancerIp> vipList) {
        this.vipList = vipList;
    }

    public String getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getMasterIp() {
        return this.masterIp;
    }

    public void setMasterIp(String masterIp) {
        this.masterIp = masterIp;
    }

    public String getBackupIp() {
        return this.backupIp;
    }

    public void setBackupIp(String backupIp) {
        this.backupIp = backupIp;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Boolean getIsWorking() {
        return this.isWorking;
    }

    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }

    public List<ListenerInfo> getListenerList() {
        return this.listenerList;
    }

    public void setListenerList(List<ListenerInfo> listenerList) {
        this.listenerList = listenerList;
    }

    public List<BackendInfo> getBackendList() {
        return this.backendList;
    }

    public void setBackendList(List<BackendInfo> backendList) {
        this.backendList = backendList;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}