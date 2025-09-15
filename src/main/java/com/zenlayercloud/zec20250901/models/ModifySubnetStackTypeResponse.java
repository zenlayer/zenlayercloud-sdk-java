package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改子网堆栈类型的响应结果。
 */
public class ModifySubnetStackTypeResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 分配的IPv6地址段
     */
    public String ipv6CidrBlock;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

}