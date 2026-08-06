package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class CreateListenerRequest extends TeaModel {


    /**
     * 负载均衡实例 ID。
     */
    public String loadBalancerId;

    /**
     * 要创建的监听器名称。
     * 仅支持字母、数字、连字符 (-) 和句点 (.)，且开头和结尾必须是字母或数字。
     */
    public String listenerName;

    /**
     * 健康检查相关参数。
     * 如果不传该参数或者healthCheck.enable = false. 将会关闭健康检查。
     */
    public HealthCheck healthCheck;

    /**
     * 监听器协议。
     */
    public String protocol;

    /**
     * 监听器转发的方式。
     */
    public String scheduler;

    /**
     * 监听器端口。
     * 多个端口使用,分隔。
     * 当端口是范围时用`-`连接，例如：10000-10005。
     * 端口的取值范围为0～65535，0代表全范围端口。
     * 请注意端口不能和该监听器的其他端口有重叠。
     * 范围端口与全端口在配额计算中均按1个端口计。
     * 连续的单端口会被自动合并为区间端口后再保存和返回，例如`1,2,3,4,5`会被保存为`1-5`。
     */
    public String port;

    /**
     * 工作模式。
     * 若该负载均衡器已有监听器，默认沿用其工作模式；否则根据负载均衡实例所在的区域设定默认值（默认值可能为DNAT、FNAT）。
     * 同一负载均衡器下所有监听器工作模式必须一致，DR模式下监听器不支持设置为全端口（0）。
     */
    public String kind;

    /**
     * 会话保持时间，单位秒。
     */
    public Integer persistent;

    /**
     * 空闲超时时间，单位秒。
     */
    public Integer idleTimeout;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerName() {
        return this.listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getPersistent() {
        return this.persistent;
    }

    public void setPersistent(Integer persistent) {
        this.persistent = persistent;
    }

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

}