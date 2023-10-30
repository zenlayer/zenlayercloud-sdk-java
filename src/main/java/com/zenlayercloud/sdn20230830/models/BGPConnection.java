/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-09 18:10:09
 * @version $ Id: BGPConnection.java, v 0.1  alicat.xu Exp $
 */
public class BGPConnection extends TeaModel {

    /**
     * BGP 对等体的 IP 地址。
     */
    public String peerIpAddress;

    /**
     * 远程 BGP 对等体的 ASN。
     */
    public Integer peerAsn;

    /**
     * 本地 BGP 的 ASN。
     */
    public Integer localAsn;

    /**
     * 用于验证 BGP MD5 认证的对等体的共享密钥。
     */
    public String password;
}
