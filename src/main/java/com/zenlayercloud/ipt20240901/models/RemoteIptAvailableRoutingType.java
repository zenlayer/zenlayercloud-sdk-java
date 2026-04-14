package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用的路由类型信息。
 */
public class RemoteIptAvailableRoutingType extends TeaModel {


    /**
     * 路由类型。
     */
    public String routingType;

    /**
     * 交付模式。
     */
    public String deliveryType;

    public String getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

}