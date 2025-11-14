package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * UDP反射源端口
 */
public class ReflectUdpPortPolicy extends TeaModel {


    /**
     * 反射攻击类型
     */
    public String name;

    /**
     * 反射源端口
     */
    public Integer port;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}