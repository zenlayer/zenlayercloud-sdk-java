package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateSubnetsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的子网ID列表，顺序与请求中的子网列表一致。
     */
    public List<String> subnetIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}