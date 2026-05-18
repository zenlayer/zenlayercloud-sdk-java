package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeAiUsageDetailDataRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceIds;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 开始时间戳10位，示例：1659427200。
     */
    public Long start;

    /**
     * 结束时间戳10位，示例：1659434400。
     */
    public Long end;

    public String getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Long getStart() {
        return this.start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return this.end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

}