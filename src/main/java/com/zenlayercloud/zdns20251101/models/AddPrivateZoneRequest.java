package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AddPrivateZoneRequest extends TeaModel {


    /**
     * 域名。
     * 格式必须域名，最长不超过252个字符，也可以是单独的不带点的域名后缀（长度2-63）。
     * 不区分大小写
     */
    public String zoneName;

    /**
     * 是否开启子域名递归代理
     */
    public String proxyPattern;

    /**
     * 要绑定的VPC ID列表
     */
    public List<String> vpcIds;

    /**
     * 资源组ID
     */
    public String resourceGroupId;

    /**
     * 备注信息。
     * 最长不超过255个字符
     */
    public String remark;

    /**
     * 关联的标签
     */
    public TagAssociation tags;

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

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}