package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class RegisterBackendRequest extends TeaModel {


    /**
     * 监听器的ID。
     */
    public String listenerId;

    /**
     * 后端配置服务器名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String backendName;

    /**
     * 裸金属实例ID。
     */
    public String instanceId;

    /**
     * 用于保证请求的幂等性。
     */
    public String clientToken;

    /**
     * 端口列表。
     */
    public List<Integer> portList;

    /**
     * 权重。
     */
    public Integer weight;

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public void setBackendName(String backendName) {
        this.backendName = backendName;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public List<Integer> getPortList() {
        return this.portList;
    }

    public void setPortList(List<Integer> portList) {
        this.portList = portList;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}