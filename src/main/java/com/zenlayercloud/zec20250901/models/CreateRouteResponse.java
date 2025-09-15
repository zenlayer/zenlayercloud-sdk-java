package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建路由的响应信息。
 */
public class CreateRouteResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的路由ID
     */
    public String routeId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

}