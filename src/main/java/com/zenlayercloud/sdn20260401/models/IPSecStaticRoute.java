package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * IPSec 的静态路由配置信息。
 */
public class IPSecStaticRoute extends TeaModel {


    /**
     * 静态路由的目的网段。
     * CIDR 格式。
     */
    public String cidr;

    public String getCidr() {
        return this.cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

}