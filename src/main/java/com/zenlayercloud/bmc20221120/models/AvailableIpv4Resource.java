package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class AvailableIpv4Resource extends TeaModel {

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * 可选的掩码列表。
     */
    public Integer netmask;

    /**
     * 售卖的状态。
     */
    public String sellStatus;

}
