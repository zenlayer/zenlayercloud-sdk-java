package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassociateHaVipRequest extends TeaModel {


    /**
     * 高可用虚拟IP的ID。
     */
    public String haVipId;

    /**
     * 要解绑的实例ID。
     */
    public String instanceId;

    public String getHaVipId() {
        return this.haVipId;
    }

    public void setHaVipId(String haVipId) {
        this.haVipId = haVipId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}