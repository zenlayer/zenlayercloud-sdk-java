package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateBandwidthClusterRequest extends TeaModel {


    /**
     * 共享带宽包所属地域。
     * 具体地域信息可以查询[DescribeBandwidthClusterAreas](../bandwidth-cluster/describebandwidthclusterareas.md)中的`areaCode`获取。
     */
    public String areaCode;

    /**
     * 保底带宽值。
     * 单位: Mbps。
     */
    public Integer commitBandwidthMbps;

    /**
     * 国际线路保底带宽值。
     * 单位: Mbps。
     * 仅 PathBasedBandwidth 线路使用。
     */
    public Integer internationalCommitBandwidthMbps;

    /**
     * IP网络类型。
     * 城市共享带宽包该字段必填。
     */
    public String networkLineType;

    /**
     * IP网络类型。
     * 请使用`networkLineType`代替。
     */
    @Deprecated
    public String networkType;

    /**
     * 带宽计费方式。
     * 默认为月95计费，如果需要日峰值计费，请联系Support开通相关权限。
     */
    public String internetChargeType;

    /**
     * 带宽包显示名称。
     * 如果未指定，默认会使用地域名称命名。
     */
    public String name;

    /**
     * 城市带宽包所属的产品线范围。
     */
    public String product;

    /**
     * 创建后共享带宽包所在的资源组ID，如不指定则放入默认资源组。
     */
    public String resourceGroupId;

    /**
     * 创建共享带宽包时关联的标签。
     */
    public TagAssociation tags;

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getCommitBandwidthMbps() {
        return this.commitBandwidthMbps;
    }

    public void setCommitBandwidthMbps(Integer commitBandwidthMbps) {
        this.commitBandwidthMbps = commitBandwidthMbps;
    }

    public Integer getInternationalCommitBandwidthMbps() {
        return this.internationalCommitBandwidthMbps;
    }

    public void setInternationalCommitBandwidthMbps(Integer internationalCommitBandwidthMbps) {
        this.internationalCommitBandwidthMbps = internationalCommitBandwidthMbps;
    }

    public String getNetworkLineType() {
        return this.networkLineType;
    }

    public void setNetworkLineType(String networkLineType) {
        this.networkLineType = networkLineType;
    }

    @Deprecated
    public String getNetworkType() {
        return this.networkType;
    }

    @Deprecated
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
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