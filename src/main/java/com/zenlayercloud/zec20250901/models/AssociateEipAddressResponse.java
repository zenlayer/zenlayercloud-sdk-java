package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * EIP绑定云产品的响应信息。
 */
public class AssociateEipAddressResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 绑定失败的IP
     */
    public List<String> failedEipIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedEipIds() {
        return this.failedEipIds;
    }

    public void setFailedEipIds(List<String> failedEipIds) {
        this.failedEipIds = failedEipIds;
    }

}