package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyInstanceTypeRequest extends TeaModel {


    /**
     * 要变更规格的实例ID。
     */
    public String instanceId;

    /**
     * 变更的目标实例规格。普通实例取值可通过[DescribeZoneInstanceConfigInfos](describezoneinstanceconfiginfos.md)获得；GPU 实例取值可通过[DescribeZoneGpuInstanceConfigInfos](describezoneGpuinstanceconfiginfos.md)获得。
     */
    public String instanceType;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

}