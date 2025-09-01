package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


/**
 * EIP更换的请求信息。
 */
public class ChangeEipBindTypeRequest extends TeaModel {


    /**
     */
    public String eipId;

    /**
     * 绑定类型。
     * 当绑定的是网卡时生效。
     * 默认为普通NAT模式
     */
    public String bindType;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getBindType() {
        return this.bindType;
    }

    public void setBindType(String bindType) {
        this.bindType = bindType;
    }

}