package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 可连接数据中心信息。
 */
public class InternetDatacenter extends TeaModel {


    /**
     * 数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * 该数据中心可用的路由模式列表。
     */
    public List<InternetAvailableRoutingType> availableRoutingTypes;

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public List<InternetAvailableRoutingType> getAvailableRoutingTypes() {
        return this.availableRoutingTypes;
    }

    public void setAvailableRoutingTypes(List<InternetAvailableRoutingType> availableRoutingTypes) {
        this.availableRoutingTypes = availableRoutingTypes;
    }

}