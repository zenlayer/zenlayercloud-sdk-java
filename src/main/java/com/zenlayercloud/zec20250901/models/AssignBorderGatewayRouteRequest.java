package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AssignBorderGatewayRouteRequest extends TeaModel {


    /**
     * 边界网关ID
     */
    public String zbgId;

    /**
     * 自定义路由ID集合
     */
    public List<String> advertisedRouteIds;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

    public List<String> getAdvertisedRouteIds() {
        return this.advertisedRouteIds;
    }

    public void setAdvertisedRouteIds(List<String> advertisedRouteIds) {
        this.advertisedRouteIds = advertisedRouteIds;
    }

}