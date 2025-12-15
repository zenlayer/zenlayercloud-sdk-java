package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述健康检查的相关信息。
 */
public class HealthCheck extends TeaModel {


    /**
     * 是否开启健康检查
     */
    public Boolean enabled;

    /**
     * 健康检查使用的协议。
     * 当开启健康检查时， 该字段必填
     */
    public String checkType;

    /**
     * 健康检查端口。
     * 默认为后端服务的端口，除非您希望指定特定端口，否则建议留空
     */
    public Integer checkPort;

    /**
     * 健康检查的检查间隔时间。
     * 单位:秒
     */
    public Integer checkDelayLoop;

    /**
     * 健康检查的连接超时时间。
     * 单位:秒
     */
    public Integer checkConnTimeout;

    /**
     * 检查重试次数
     */
    public Integer checkRetry;

    /**
     * 健康检查重试的间隔时间。
     * 单位:秒
     */
    public Integer checkDelayTry;

    /**
     * 健康检查路径。
     * 仅适用于HTTP_GET的协议。
     * 如果指定，必须以/开头
     */
    public String checkHttpGetUrl;

    /**
     * 健康检查状态码。
     * 仅适用于HTTP_GET的协议
     */
    public Integer checkHttpStatusCode;

    /**
     * 开启后，当所有后端健康检查均失败时，负载均衡器将暂视所有节点为健康，继续转发流量，以保障业务连续性
     */
    public Boolean failOpen;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public Integer getCheckPort() {
        return this.checkPort;
    }

    public void setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
    }

    public Integer getCheckDelayLoop() {
        return this.checkDelayLoop;
    }

    public void setCheckDelayLoop(Integer checkDelayLoop) {
        this.checkDelayLoop = checkDelayLoop;
    }

    public Integer getCheckConnTimeout() {
        return this.checkConnTimeout;
    }

    public void setCheckConnTimeout(Integer checkConnTimeout) {
        this.checkConnTimeout = checkConnTimeout;
    }

    public Integer getCheckRetry() {
        return this.checkRetry;
    }

    public void setCheckRetry(Integer checkRetry) {
        this.checkRetry = checkRetry;
    }

    public Integer getCheckDelayTry() {
        return this.checkDelayTry;
    }

    public void setCheckDelayTry(Integer checkDelayTry) {
        this.checkDelayTry = checkDelayTry;
    }

    public String getCheckHttpGetUrl() {
        return this.checkHttpGetUrl;
    }

    public void setCheckHttpGetUrl(String checkHttpGetUrl) {
        this.checkHttpGetUrl = checkHttpGetUrl;
    }

    public Integer getCheckHttpStatusCode() {
        return this.checkHttpStatusCode;
    }

    public void setCheckHttpStatusCode(Integer checkHttpStatusCode) {
        this.checkHttpStatusCode = checkHttpStatusCode;
    }

    public Boolean getFailOpen() {
        return this.failOpen;
    }

    public void setFailOpen(Boolean failOpen) {
        this.failOpen = failOpen;
    }

}