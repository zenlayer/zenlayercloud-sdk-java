package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * BackendInfo 信息
 */
public class BackendInfo extends TeaModel {


    /**
     * Listener的ID。
     */
    public String listenerId;

    /**
     * Backend的ID。
     */
    public String backendId;

    /**
     * Backend的名称。
     */
    public String backendName;

    /**
     * 状态。
     */
    public String status;

    /**
     * 端口。
     */
    public String port;

    /**
     * 权重。
     */
    public Integer weight;

    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 实例名称。
     */
    public String instanceName;

    /**
     * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-ddTHH:mm:ssZ`。
     */
    public String createTime;

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getBackendId() {
        return this.backendId;
    }

    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public void setBackendName(String backendName) {
        this.backendName = backendName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}