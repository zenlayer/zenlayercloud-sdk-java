package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeDatacentersWithServiceRequest extends TeaModel {


    /**
     * 公有云区域 ID。
     */
    public String cloudRegionId;

    /**
     * 数据中心 ID。
     */
    public String dcId;

    /**
     * 服务类型。
     */
    public String serviceType;

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

    public String getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}