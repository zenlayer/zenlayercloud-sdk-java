/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2024-05-24 09:12:28
 * @version $ Id: RemoteIptDescribePriceResponse.java, v 0.1  wolfgang Exp $
 */
public class InquiryCreateIPTransitPriceResponse extends TeaModel {

    public Price                  privateConnectPrice;
    public Price                  iptBandwidthPrice;
    public List<IpPricesResponse> publicIpPrices;

    public static class IpPricesResponse extends TeaModel {
        public Price   price;
        public Integer netmask;
        public Integer qty;
    }
}
