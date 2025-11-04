package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryBandwidthClusterPriceRequest extends TeaModel {


    /**
     * 共享带宽包所属地域。
     * 具体地域信息可以查询[DescribeBandwidthClusterAreas](../bandwidth-cluster/describebandwidthclusterareas.md)中的`areaCode`获取
     */
    public String areaCode;

    /**
     * 保底带宽值。
     * 单位: Mbps
     */
    public Integer commitBandwidthMbps;

    /**
     * IP 网络类型
     */
    public String networkType;

    /**
     * 带宽计费方式。
     * 默认为月95计费，如果需要日峰值计费，请联系Support开通相关权限
     */
    public String internetChargeType;

    /**
     * 产品线
     */
    public String product;

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

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}