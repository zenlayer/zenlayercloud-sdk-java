package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 工单沟通记录。
 */
public class TicketMessage extends TeaModel {


    /**
     * 邮件主题。
     */
    public String subject;

    /**
     * 邮件正文。
     * 仅保留本次回复内容，不含被引用的历史邮件。
     */
    public String content;

    /**
     * 发件人姓名。
     */
    public String fromName;

    /**
     * 发件人邮箱。
     */
    public String fromAddress;

    /**
     * 收件人邮箱。
     */
    public String toAddress;

    /**
     * 抄送邮箱。
     */
    public String ccAddress;

    /**
     * 邮件时间。
     */
    public String messageDate;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFromName() {
        return this.fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromAddress() {
        return this.fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return this.toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getCcAddress() {
        return this.ccAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    public String getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

}