package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 静态路由的配置信息。
 */
public class IPRoute extends TeaModel {


    /**
     * 静态路由的目的网段（CIDR）。
     */
    public String prefix;

    /**
     * 静态路由的下一跳 IP 地址。
     */
    public String nextHop;

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNextHop() {
        return this.nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

}