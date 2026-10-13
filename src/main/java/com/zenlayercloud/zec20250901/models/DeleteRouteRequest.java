package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteRouteRequest extends TeaModel {


    /**
     * 路由ID。
     * 可通过调用 ~~DescribeRoutes~~ 获取。
     */
    public String routeId;

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

}