package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyRouteAttributeRequest extends TeaModel {


    /**
     * 路由ID。
     * 可通过调用 ~~DescribeRoutes~~ 获取。
     */
    public String routeId;

    /**
     * 路由名称。
     * 名称长度为2到63个字符，仅支持字母、数字、连字符（-）、下划线（_）、斜杠（/）和英文句点（.），且开头和结尾必须是字母或数字。
     */
    public String name;

    public String getRouteId() {
        return this.routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}