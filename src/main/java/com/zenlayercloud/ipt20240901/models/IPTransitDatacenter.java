package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述支持IP Transit的数据中心信息，包括数据中心的基本信息以及支持的路由类型等。
 */
public class IPTransitDatacenter extends TeaModel {


    /**
     * 数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 支持的路由类型配置。
     */
    public List<RemoteIptAvailableRoutingType> availableRoutingTypes;

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public List<RemoteIptAvailableRoutingType> getAvailableRoutingTypes() {
        return this.availableRoutingTypes;
    }

    public void setAvailableRoutingTypes(List<RemoteIptAvailableRoutingType> availableRoutingTypes) {
        this.availableRoutingTypes = availableRoutingTypes;
    }

}