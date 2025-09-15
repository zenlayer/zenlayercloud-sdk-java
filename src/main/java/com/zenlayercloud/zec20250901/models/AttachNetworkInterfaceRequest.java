package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡绑定实例的请求参数。
 */
public class AttachNetworkInterfaceRequest extends TeaModel {


    /**
     * 需要操作的网卡ID
     */
    public String nicId;

    /**
     * 需要绑定的实例ID
     */
    public String instanceId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}