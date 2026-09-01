package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateTicketRequest extends TeaModel {


    /**
     * 工单类型。
     */
    public String type;

    /**
     * 问题描述。
     * 长度1到4000个字符。
     */
    public String description;

    /**
     * 联系人姓名。
     * 不填时取当前登录用户的姓名。
     */
    public String contactName;

    /**
     * 联系邮箱。
     * 工单的后续沟通邮件发送到该邮箱，工单详情也按该邮箱过滤邮件往来记录。
     * 不填时取当前登录用户的邮箱。
     */
    public String contactEmail;

    /**
     * 联系电话。
     */
    public String contactPhone;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

}