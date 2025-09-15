package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改路由信息的请求信息。
 */
public class ModifyRouteAttributeRequest extends TeaModel {


    /**
     * 路由ID
     */
    public String routeId;

    /**
     * 路由名称。
     * 名称长度为 2 到 63 个字符，仅支持字母、数字、连字符 (-) 、下划线(_) 、斜杠(/) 、和句点 (.)，且开头和结尾必须是字母或数字
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