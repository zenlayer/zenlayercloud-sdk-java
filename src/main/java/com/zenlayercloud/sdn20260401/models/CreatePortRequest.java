package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreatePortRequest extends TeaModel {


    /**
     * 数据中心ID。
     * 可通过 ~~DescribeDataCenters~~ 接口获取。
     */
    public String dcId;

    /**
     * 数据中心端口名称。
     * 不超过 255 字符，建议使用数据中心四字码+数据中心端口规格。
     */
    public String portName;

    /**
     * 数据中心端口备注信息。
     * 不超过 255 字符。
     */
    public String portRemarks;

    /**
     * 数据中心端口规格。
     * 可通过 ~~DescribeDataCenterPortPrice~~ 接口获取，取值：1G | 10G | 40G | 100G | 400G。
     */
    public String portType;

    /**
     * 商业实体名称。
     * 用于 LOA 抬头。
     */
    public String businessEntityName;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建数据中心端口时关联的标签。
     * 注意：关联`标签键`不能重复。
     */
    public TagAssociation tags;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortRemarks() {
        return this.portRemarks;
    }

    public void setPortRemarks(String portRemarks) {
        this.portRemarks = portRemarks;
    }

    public String getPortType() {
        return this.portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getBusinessEntityName() {
        return this.businessEntityName;
    }

    public void setBusinessEntityName(String businessEntityName) {
        this.businessEntityName = businessEntityName;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}