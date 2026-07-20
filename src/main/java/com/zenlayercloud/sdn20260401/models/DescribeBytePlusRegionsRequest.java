package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeBytePlusRegionsRequest extends TeaModel {


    /**
     * 筛选云节点支持的产品。
     * 可用值：PrivateConnect(二层网络)、CloudRouter(三层网络)。
     */
    public String product;

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}