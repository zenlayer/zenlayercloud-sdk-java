package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ConfigEipEgressIpRequest extends TeaModel {


    /**
     * 要作为出口的公网弹性IP。
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}