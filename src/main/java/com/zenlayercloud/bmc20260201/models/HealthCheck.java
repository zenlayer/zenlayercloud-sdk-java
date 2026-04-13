package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * HealthCheck 信息
 */
public class HealthCheck extends TeaModel {


    /**
     * 检查开关。
     */
    public Boolean checkEnabled;

    /**
     * 检查类型。
     */
    public String checkType;

    /**
     * 连接时间。
     */
    public Integer checkConnectTimeout;

    /**
     * 重试次数。
     */
    public Integer checkRetry;

    /**
     * 超时时间。
     */
    public Integer checkDelayBeforeRetry;

    /**
     * 重试间隔。
     */
    public Integer checkIntervalTime;

    /**
     * 检查端口。
     */
    public Integer checkPort;

    /**
     * Http版本。
     */
    public String httpVersion;

    /**
     * Http地址。
     */
    public String httpCheckPath;

    /**
     * Http摘要认证。
     */
    public Integer httpCheckDigest;

    /**
     * 状态码。
     */
    public Integer httpCode;

    /**
     * Misc地址。
     */
    public String miscCheckPath;

    /**
     * Misc超时时间。
     */
    public Integer miscTimeout;

    public Boolean getCheckEnabled() {
        return this.checkEnabled;
    }

    public void setCheckEnabled(Boolean checkEnabled) {
        this.checkEnabled = checkEnabled;
    }

    public String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public Integer getCheckConnectTimeout() {
        return this.checkConnectTimeout;
    }

    public void setCheckConnectTimeout(Integer checkConnectTimeout) {
        this.checkConnectTimeout = checkConnectTimeout;
    }

    public Integer getCheckRetry() {
        return this.checkRetry;
    }

    public void setCheckRetry(Integer checkRetry) {
        this.checkRetry = checkRetry;
    }

    public Integer getCheckDelayBeforeRetry() {
        return this.checkDelayBeforeRetry;
    }

    public void setCheckDelayBeforeRetry(Integer checkDelayBeforeRetry) {
        this.checkDelayBeforeRetry = checkDelayBeforeRetry;
    }

    public Integer getCheckIntervalTime() {
        return this.checkIntervalTime;
    }

    public void setCheckIntervalTime(Integer checkIntervalTime) {
        this.checkIntervalTime = checkIntervalTime;
    }

    public Integer getCheckPort() {
        return this.checkPort;
    }

    public void setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
    }

    public String getHttpVersion() {
        return this.httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public String getHttpCheckPath() {
        return this.httpCheckPath;
    }

    public void setHttpCheckPath(String httpCheckPath) {
        this.httpCheckPath = httpCheckPath;
    }

    public Integer getHttpCheckDigest() {
        return this.httpCheckDigest;
    }

    public void setHttpCheckDigest(Integer httpCheckDigest) {
        this.httpCheckDigest = httpCheckDigest;
    }

    public Integer getHttpCode() {
        return this.httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public String getMiscCheckPath() {
        return this.miscCheckPath;
    }

    public void setMiscCheckPath(String miscCheckPath) {
        this.miscCheckPath = miscCheckPath;
    }

    public Integer getMiscTimeout() {
        return this.miscTimeout;
    }

    public void setMiscTimeout(Integer miscTimeout) {
        this.miscTimeout = miscTimeout;
    }

}