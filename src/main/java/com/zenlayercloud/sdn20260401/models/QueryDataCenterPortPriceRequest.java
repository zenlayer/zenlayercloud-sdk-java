package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryDataCenterPortPriceRequest extends TeaModel {


    /**
     * 数据中心ID。
     * 具体取值可通过调用接口~~DescribeDataCenters~~来获得最新的数据中心列表。
     */
    public String dcId;

    /**
     * 数据中心端口规格。
     * 具体取值可通过调用接口~~DescribeDataCenterPortType~~来获得最新的数据中心端口规格表。
     */
    public String portType;

    /**
     * 是否需要Zenlayer协助建设交叉连接。
     * 如果选择true，则价格将包含交叉连接的跳线费用，以及一次性建设费。
     * 默认值为false，即用户需要自行建设交叉连接。
     */
    public Boolean buildCrossConnectWithAssisted;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getPortType() {
        return this.portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public Boolean getBuildCrossConnectWithAssisted() {
        return this.buildCrossConnectWithAssisted;
    }

    public void setBuildCrossConnectWithAssisted(Boolean buildCrossConnectWithAssisted) {
        this.buildCrossConnectWithAssisted = buildCrossConnectWithAssisted;
    }

}