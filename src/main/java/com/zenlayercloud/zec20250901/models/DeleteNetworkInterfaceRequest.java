package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteNetworkInterfaceRequest extends TeaModel {


    /**
     * 要删除的网卡ID。
     * 可通过调用 ~~DescribeNetworkInterfaces~~ 获取。
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}