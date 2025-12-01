package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述内网权威域名的信息。
 */
public class PrivateZone extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 内网权威域名
     */
    public String zoneName;

    /**
     * 是否开启子域名递归代理
     */
    public String proxyPattern;

    /**
     * 备注信息。
     * 最长不超过255个字符
     */
    public String remark;

    /**
     * 解析记录数
     */
    public Integer recordCount;

    /**
     * 绑定的VPC ID列表
     */
    public List<String> vpcIds;

    /**
     * 关联的标签
     */
    public Tags tags;

    /**
     * 内网权威域名所在的资源组信息
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 内网权威域名的创建时间
     */
    public String createTime;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public void setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRecordCount() {
        return this.recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}