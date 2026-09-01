package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeTicketDetailRequest extends TeaModel {


    /**
     * 工单ID。
     */
    public String ticketId;

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

}