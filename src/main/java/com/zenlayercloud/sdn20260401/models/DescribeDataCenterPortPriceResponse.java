package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeDataCenterPortPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 在售数据中心端口类型及价格结果集。
     */
    public List<PortPrice> portPriceSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PortPrice> getPortPriceSet() {
        return this.portPriceSet;
    }

    public void setPortPriceSet(List<PortPrice> portPriceSet) {
        this.portPriceSet = portPriceSet;
    }

}