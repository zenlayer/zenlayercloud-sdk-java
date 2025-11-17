package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 攻击端口。
 */
public class TopPort extends TeaModel {


    /**
     * 协议
     */
    public String protocol;

    /**
     * 端口号
     */
    public Integer port;

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}