package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class RenewCloudRouterRequest extends TeaModel {


    /**
     * 三层网络的 ID。
     */
    public String cloudRouterId;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

}