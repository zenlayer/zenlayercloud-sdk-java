package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 边界网关路由宣告中移除指定的自定义路由的请求信息。
 */
public class UnassignBorderGatewayRouteRequest extends TeaModel {


    /**
     * 边界网关ID
     */
    public String zbgId;

    /**
     * 要移除的自定义路由ID集合
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