package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AssociateHaVipRequest extends TeaModel {


    /**
     * 高可用虚拟IP的ID。
     * 可通过调用 ~~DescribeHaVips~~ 获取。
     */
    public String haVipId;

    /**
     * 要绑定的实例ID。
     * 实例网卡必须与HaVip处于同一子网。
     * 可通过调用 ~~DescribeInstances~~ 获取。
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