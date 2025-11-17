package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class ModifyListenerRequest extends TeaModel {


    /**
     * 负载均衡器ID
     */
    public String loadBalancerId;

    /**
     * 负载均衡器的监听器ID
     */
    public String listenerId;

    /**
     * 负载均衡器的监听器名称。
     * 不传则不会进行修改
     */
    public String listenerName;

    /**
     * 负载均衡器的监听器健康检查。
     * 不传则不会进行修改，如果开启或关闭，请设置`HealthCheck.enabled`字段
     */
    public HealthCheck healthCheck;

    /**
     * 负载均衡器的监听器调度方式。
     * 不传则不会进行修改
     */
    public String scheduler;

    /**
     * 监听器端口。
     * 多个端口使用,分隔。
     * 当端口是范围时用`-`连接，例如：10000-10005。
     * 端口的取值范围为1～65535。
     * 不指定将不会进行修改
     */
    public String port;

    /**
     * 工作模式。
     * 如果修改为`DR`模式，如果后端服务器指定了端口将失效，将跟随监听器的端口
     */
    public String kind;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
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

}