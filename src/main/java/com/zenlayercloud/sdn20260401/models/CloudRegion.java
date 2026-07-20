package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述公有云接入区域及其支持的产品、高可用类型信息。
 */
public class CloudRegion extends TeaModel {


    /**
     * 公有云区域 ID。
     */
    public String cloudRegionId;

    /**
     * 接入点数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 该区域支持的产品列表：PrivateConnect(二层网络)、CloudRouter(三层网络)。
     */
    public List<String> products;

    /**
     * 该区域支持的高可用类型列表。
     */
    public List<HaTypeInfo> haTypes;

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public List<String> getProducts() {
        return this.products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<HaTypeInfo> getHaTypes() {
        return this.haTypes;
    }

    public void setHaTypes(List<HaTypeInfo> haTypes) {
        this.haTypes = haTypes;
    }

}