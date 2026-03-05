package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * DDoS 反射攻击相关信息。
 */
public class DdosReflectUdpPort extends TeaModel {


    /**
     * 反射攻击防护过滤的端口。
     */
    public Integer port;

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}