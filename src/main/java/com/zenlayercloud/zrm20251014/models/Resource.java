package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 资源信息的请求参数。
 */
public class Resource extends TeaModel {


    /**
     * 资源类型
     */
    public String type;

    /**
     * 资源唯一标识
     */
    public String uuid;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}