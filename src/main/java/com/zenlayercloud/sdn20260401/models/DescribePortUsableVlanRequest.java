package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePortUsableVlanRequest extends TeaModel {


    /**
     * 数据中心端口 ID。
     * 数据中心端口或数据中心至少传一个。
     */
    public String portId;

    /**
     * 数据中心ID。
     * 可通过 ~~DescribeDataCenters~~ 接口获取。
     * 数据中心端口或数据中心至少传一个。
     */
    public String dcId;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

}