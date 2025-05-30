package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * Auto-generated by SDK Generator
 */
public class HealthCheck extends TeaModel {


    public Boolean enabled;

    public String checkType;

    public Integer checkPort;

    public Integer checkDelayLoop;

    public Integer checkConnTimeout;

    public Integer checkRetry;

    public Integer checkDelayTry;

    public String checkHttpGetUrl;

    public Integer checkHttpStatusCode;

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

}