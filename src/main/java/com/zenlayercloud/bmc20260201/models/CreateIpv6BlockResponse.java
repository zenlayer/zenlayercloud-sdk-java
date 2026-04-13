package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateIpv6BlockResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * Cidr Block ID列表。
     */
    public List<String> cidrBlockIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getCidrBlockIds() {
        return this.cidrBlockIds;
    }

    public void setCidrBlockIds(List<String> cidrBlockIds) {
        this.cidrBlockIds = cidrBlockIds;
    }

}