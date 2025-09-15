package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 更换弹性公网IP绑定模式请求信息。
 */
public class ChangeEipBindTypeRequest extends TeaModel {


    /**
     * 要更换绑定模式的EIP ID
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