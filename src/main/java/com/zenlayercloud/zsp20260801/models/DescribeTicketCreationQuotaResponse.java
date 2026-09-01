package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeTicketCreationQuotaResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 当前是否还可以创建工单。
     */
    public Boolean canCreate;

    /**
     * 最近一小时内已创建的工单数。
     */
    public Integer createdCountLastHour;

    /**
     * 每小时可创建的工单数上限。
     */
    public Integer limitPerHour;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Boolean getCanCreate() {
        return this.canCreate;
    }

    public void setCanCreate(Boolean canCreate) {
        this.canCreate = canCreate;
    }

    public Integer getCreatedCountLastHour() {
        return this.createdCountLastHour;
    }

    public void setCreatedCountLastHour(Integer createdCountLastHour) {
        this.createdCountLastHour = createdCountLastHour;
    }

    public Integer getLimitPerHour() {
        return this.limitPerHour;
    }

    public void setLimitPerHour(Integer limitPerHour) {
        this.limitPerHour = limitPerHour;
    }

}