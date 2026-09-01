package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeTicketDetailResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

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
     * 联系人姓名。
     */
    public String contactName;

    /**
     * 联系邮箱。
     */
    public String contactEmail;

    /**
     * 联系电话。
     */
    public String contactPhone;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 工单沟通记录，按时间倒序排列，末条为提单时的初始描述。
     * 仅包含与联系邮箱相关的往来邮件。
     */
    public List<TicketMessage> messages;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

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

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<TicketMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(List<TicketMessage> messages) {
        this.messages = messages;
    }

}