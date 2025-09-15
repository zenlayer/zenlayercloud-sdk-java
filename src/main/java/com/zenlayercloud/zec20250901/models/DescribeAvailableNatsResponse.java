package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询可以绑定边界网关的NAT响应信息。
 */
public class DescribeAvailableNatsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可以绑定边界网关的NAT ID集合
     */
    public List<String> natIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getNatIds() {
        return this.natIds;
    }

    public void setNatIds(List<String> natIds) {
        this.natIds = natIds;
    }

}