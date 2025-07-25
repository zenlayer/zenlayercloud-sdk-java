package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述后端服务器的健康检查状态信息。
 */
public class BackendHealthStatusDetail extends TeaModel {


    /**
     * 后端服务器的端口
     */
    public Integer port;

    /**
     * 健康检查的状态
     */
    public String healthStatus;

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHealthStatus() {
        return this.healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

}