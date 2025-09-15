package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除路由的请求信息。
 */
public class DeleteRouteRequest extends TeaModel {


    /**
     * 路由ID
     */
    public String routeId;

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

}