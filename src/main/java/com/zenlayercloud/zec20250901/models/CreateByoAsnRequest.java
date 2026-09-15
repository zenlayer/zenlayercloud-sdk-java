package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateByoAsnRequest extends TeaModel {


    /**
     * 待接入的公网ASN号。
     * 支持 2 字节与 4 字节 ASN，最大值 4294967295。
     */
    public Long asn;

    /**
     * 创建后 BYO ASN 所在的资源组ID。
     * 如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 创建 BYO ASN 时关联的标签。
     * 注意：关联「标签键」不能重复。
     */
    public TagAssociation tags;

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}