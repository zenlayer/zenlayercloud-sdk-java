package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateTicketResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 工单ID。
     * 后续查询工单详情使用该ID。
     */
    public String ticketId;

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

}