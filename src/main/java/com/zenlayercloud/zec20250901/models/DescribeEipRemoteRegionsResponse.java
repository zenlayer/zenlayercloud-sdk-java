package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询EIP支持的远程指向的节点信息的响应信息。
 */
public class DescribeEipRemoteRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 支持的远端的节点ID列表
     */
    public List<String> peerRegionIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getPeerRegionIds() {
        return this.peerRegionIds;
    }

    public void setPeerRegionIds(List<String> peerRegionIds) {
        this.peerRegionIds = peerRegionIds;
    }

}