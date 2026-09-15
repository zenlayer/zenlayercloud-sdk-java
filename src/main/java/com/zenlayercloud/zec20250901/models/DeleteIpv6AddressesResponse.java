package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeleteIpv6AddressesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 删除失败的公网IPv6详情列表。
     * 若全量成功则为空。
     */
    public List<DeleteIpv6AddressesFailedItem> failedIpv6Addresses;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DeleteIpv6AddressesFailedItem> getFailedIpv6Addresses() {
        return this.failedIpv6Addresses;
    }

    public void setFailedIpv6Addresses(List<DeleteIpv6AddressesFailedItem> failedIpv6Addresses) {
        this.failedIpv6Addresses = failedIpv6Addresses;
    }

}