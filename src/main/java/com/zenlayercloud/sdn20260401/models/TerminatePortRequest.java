package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class TerminatePortRequest extends TeaModel {


    /**
     * 数据中心端口 ID。
     */
    public String portId;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

}