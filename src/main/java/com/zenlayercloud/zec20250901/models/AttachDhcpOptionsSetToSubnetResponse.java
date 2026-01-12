package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 将DHCP选项集关联到Subnet的响应信息。
 */
public class AttachDhcpOptionsSetToSubnetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 操作失败的subnet ID集合
     */
    public List<String> failedSubnetIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedSubnetIds() {
        return this.failedSubnetIds;
    }

    public void setFailedSubnetIds(List<String> failedSubnetIds) {
        this.failedSubnetIds = failedSubnetIds;
    }

}