package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

public class InquiryPriceCreateInstanceResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public Price specPrice;

    public Price gpuPrice;

    public Price ipv4Price;

    public Price ipv6Price;

    public Price ipv4BandwidthPrice;

    public Price ipv6BandwidthPrice;

    public Price systemDiskPrice;

    public Price dataDiskPrice;
}
