package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * BYO ASN 信息。
 */
public class ByoAsnInfo extends TeaModel {


    /**
     * BYO ASN 的ID。
     */
    public String byoAsnId;

    /**
     * ASN号。
     */
    public Long asn;

    /**
     * 当前状态。
     */
    public String status;

    /**
     * 来源类型。
     */
    public String type;

    /**
     * 校验码。
     * 需要客户将其写入 RIR 上该ASN的 aut-num 对象。
     */
    public String verifyCode;

    /**
     * 完整的 export 声明语句。
     * 客户直接复制该语句写入 RIR 上该ASN的 aut-num 对象即可。
     */
    public String exportDeclaration;

    /**
     * 该ASN下已宣告的IPv4 CIDR数量。
     */
    public Integer ipv4CidrCount;

    /**
     * 该ASN下已宣告的IPv6 CIDR数量。
     */
    public Integer ipv6CidrCount;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 所属资源组信息。
     */
    public ResourceGroupInfo resourceGroup;

    /**
     * 标签列表。
     */
    public Tags tags;

    public String getByoAsnId() {
        return this.byoAsnId;
    }

    public void setByoAsnId(String byoAsnId) {
        this.byoAsnId = byoAsnId;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
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

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getExportDeclaration() {
        return this.exportDeclaration;
    }

    public void setExportDeclaration(String exportDeclaration) {
        this.exportDeclaration = exportDeclaration;
    }

    public Integer getIpv4CidrCount() {
        return this.ipv4CidrCount;
    }

    public void setIpv4CidrCount(Integer ipv4CidrCount) {
        this.ipv4CidrCount = ipv4CidrCount;
    }

    public Integer getIpv6CidrCount() {
        return this.ipv6CidrCount;
    }

    public void setIpv6CidrCount(Integer ipv6CidrCount) {
        this.ipv6CidrCount = ipv6CidrCount;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}