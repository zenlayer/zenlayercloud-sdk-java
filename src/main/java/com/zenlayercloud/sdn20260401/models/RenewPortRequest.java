package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class RenewPortRequest extends TeaModel {


    /**
     * 数据中心端口 ID。
     * 仅数据中心端口状态为 RECYCLED 时可恢复。
     */
    public String portId;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

}