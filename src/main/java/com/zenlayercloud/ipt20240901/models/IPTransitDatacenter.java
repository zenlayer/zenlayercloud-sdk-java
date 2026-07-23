package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 可连接数据中心信息。
 */
public class IPTransitDatacenter extends TeaModel {


    /**
     * 数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 该数据中心可用的路由模式列表。
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