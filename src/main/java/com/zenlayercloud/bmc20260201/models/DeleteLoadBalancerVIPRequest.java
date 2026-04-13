package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DeleteLoadBalancerVIPRequest extends TeaModel {


    /**
     * 负责均衡IP的ID。
     */
    public String vipId;

    public String getVipId() {
        return this.vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

}