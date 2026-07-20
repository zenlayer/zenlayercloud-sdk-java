package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * IPSec 备份隧道的配置信息。
 */
public class BackupIPSecConfig extends TeaModel {


    /**
     * 备份 IPSec 隧道所在数据中心的 ID。
     */
    public String dcId;

    /**
     * 备份 IPSec 隧道的认证密码。
     * 长度 8-64 个字符。
     */
    public String password;

    /**
     * 备份 IPSec 隧道客户侧私网 IP 地址。
     */
    public String customerPrivateIP;

    /**
     * 备份 IPSec 隧道 Virtual Edge 侧私网 IP 地址。
     */
    public String virtualEdgePrivateIP;

    /**
     * 备份 IPSec 隧道的预共享密钥（PSK）。
     */
    public String psk;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerPrivateIP() {
        return this.customerPrivateIP;
    }

    public void setCustomerPrivateIP(String customerPrivateIP) {
        this.customerPrivateIP = customerPrivateIP;
    }

    public String getVirtualEdgePrivateIP() {
        return this.virtualEdgePrivateIP;
    }

    public void setVirtualEdgePrivateIP(String virtualEdgePrivateIP) {
        this.virtualEdgePrivateIP = virtualEdgePrivateIP;
    }

    public String getPsk() {
        return this.psk;
    }

    public void setPsk(String psk) {
        this.psk = psk;
    }

}