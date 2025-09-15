package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述创建CIDR的响应信息。
 */
public class CreateCidrResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的CIDR地址段ID列表
     */
    public List<String> cidrIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getCidrIds() {
        return this.cidrIds;
    }

    public void setCidrIds(List<String> cidrIds) {
        this.cidrIds = cidrIds;
    }

}