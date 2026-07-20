package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeCloudAvailableBandwidthTiersRequest extends TeaModel {


    /**
     * 云连接类型（AWS、TENCENT、GOOGLE、AZURE、ALI_CLOUD、HUAWEI_CLOUD、BYTE_PLUS、ORACLE）。
     */
    public String cloudType;

    /**
     * 公有云区域 ID（Google 云无需传参）。
     */
    public String cloudRegionId;

    /**
     * 连接云接入点的数据中心 ID。
     */
    public String dcId;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * 云连接 ID。
     * 修改云连接带宽限速时使用，传入后其他参数将被忽略。
     */
    public String cloudPortId;

    /**
     * 云平台账号（Google 为 Pairing Key，Azure 为 Service Key）。
     */
    public String cloudAccountId;

    /**
     * 可用区标识。
     */
    public String zoneColor;

    public String getCloudType() {
        return this.cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public String getCloudPortId() {
        return this.cloudPortId;
    }

    public void setCloudPortId(String cloudPortId) {
        this.cloudPortId = cloudPortId;
    }

    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public void setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
    }

    public String getZoneColor() {
        return this.zoneColor;
    }

    public void setZoneColor(String zoneColor) {
        this.zoneColor = zoneColor;
    }

}