package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeUsableByoAsnsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可作为BYOIP起源ASN使用的ASN号列表。
     * 包含已通过归属验证的自带ASN，以及线下已授权给该账号的ASN。
     */
    public List<Long> asns;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Long> getAsns() {
        return this.asns;
    }

    public void setAsns(List<Long> asns) {
        this.asns = asns;
    }

}