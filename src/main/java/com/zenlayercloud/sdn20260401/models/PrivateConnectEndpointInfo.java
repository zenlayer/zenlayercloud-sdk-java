package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 二层网络专线的连接点信息。根据连接点的类型不同，连接点的参数也是不同的。
 */
public class PrivateConnectEndpointInfo extends TeaModel {


    /**
     * 数据中心ID。
     * 具体取值可通过调用接口~~DescribeDataCenters~~来获得最新的数据中心列表。
     */
    public String dcId;

    /**
     * 云连接类型。
     */
    public String cloudType;

    /**
     * 云连接的最大带宽限制。
     * 默认值是10，单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * 公有云区域ID。
     * Google云无需传参。
     */
    public String cloudRegionId;

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

    public String getCloudType() {
        return this.cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
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