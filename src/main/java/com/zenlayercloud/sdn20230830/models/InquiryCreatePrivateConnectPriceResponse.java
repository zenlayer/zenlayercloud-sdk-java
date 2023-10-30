/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:46:17
 * @version $ Id: InquiryCreatePrivateConnectPriceResponse.java, v 0.1  alicat.xu Exp $
 */
public class InquiryCreatePrivateConnectPriceResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 二层网络专线带宽价格。
     */
    public Price privateConnectPrice;

    /**
     * A端的接入价格。
     */
    public Price endpointAPrice;

    /**
     * Z端的接入价格。
     */
    public Price endpointZPrice;
}
