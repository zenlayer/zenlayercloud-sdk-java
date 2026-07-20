package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * BGP 连接的配置信息。
 */
public class BGPConnection extends TeaModel {


    /**
     * 对端互联 IP 地址及掩码。
     */
    public String peerIpAddress;

    /**
     * 对端 BGP ASN。
     */
    public Long peerAsn;

    /**
     * BGP 会话的 MD5 密码。
     * 长度不超过 32 字符。
     */
    public String password;

    /**
     * 本端 BGP ASN。
     */
    public Long localAsn;

    public String getPeerIpAddress() {
        return this.peerIpAddress;
    }

    public void setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
    }

    public Long getPeerAsn() {
        return this.peerAsn;
    }

    public void setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getLocalAsn() {
        return this.localAsn;
    }

    public void setLocalAsn(Long localAsn) {
        this.localAsn = localAsn;
    }

}