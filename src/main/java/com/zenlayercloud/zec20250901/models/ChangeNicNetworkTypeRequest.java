package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 更改网卡模式的请求参数。
 */
public class ChangeNicNetworkTypeRequest extends TeaModel {


    /**
     * 待操作的实例ID
     */
    public String instanceId;

    /**
     * 要更改的网卡模式
     */
    public String nicNetworkType;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNicNetworkType() {
        return this.nicNetworkType;
    }

    public void setNicNetworkType(String nicNetworkType) {
        this.nicNetworkType = nicNetworkType;
    }

}