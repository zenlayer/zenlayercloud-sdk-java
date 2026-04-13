package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * LoadBalancerIp 信息
 */
public class LoadBalancerIp extends TeaModel {


    /**
     * VIP的ID。
     */
    public String vipId;

    /**
     * IP地址。
     */
    public String ipAddress;

    /**
     * IP类型
     * DEFAULT、EXTRA
     */
    public String type;

    /**
     * 状态。
     */
    public String status;

    public String getVipId() {
        return this.vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}