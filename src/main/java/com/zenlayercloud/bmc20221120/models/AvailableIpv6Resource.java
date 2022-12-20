package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class AvailableIpv6Resource extends TeaModel {

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * 售卖的状态。
     */
    public String sellStatus;

}
