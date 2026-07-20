package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * IPSec 的 BGP 连接配置信息。
 */
public class IPSecBGPConnection extends TeaModel {


    /**
     * 客户侧 BGP ASN。
     */
    public Long customerAsn;

    /**
     * Virtual Edge 侧 BGP ASN。
     */
    public Long virtualEdgeAsn;

    /**
     * BGP 会话的认证密码。
     * 长度 8-64 个字符。
     */
    public String password;

    public Long getCustomerAsn() {
        return this.customerAsn;
    }

    public void setCustomerAsn(Long customerAsn) {
        this.customerAsn = customerAsn;
    }

    public Long getVirtualEdgeAsn() {
        return this.virtualEdgeAsn;
    }

    public void setVirtualEdgeAsn(Long virtualEdgeAsn) {
        this.virtualEdgeAsn = virtualEdgeAsn;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}