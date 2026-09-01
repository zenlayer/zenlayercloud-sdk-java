package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 工单列表项。
 */
public class TicketItem extends TeaModel {


    /**
     * 工单ID。
     */
    public String ticketId;

    /**
     * 工单编号。
     * 工单尚在创建中（状态为CREATING）时为null。
     */
    public String ticketNumber;

    /**
     * 工单类型。
     */
    public String type;

    /**
     * 工单状态。
     */
    public String status;

    /**
     * 问题描述。
     */
    public String description;

    /**
     * 创建时间。
     */
    public String createTime;

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketNumber() {
        return this.ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}