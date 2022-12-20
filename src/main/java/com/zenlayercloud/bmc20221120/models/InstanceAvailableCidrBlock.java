package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class InstanceAvailableCidrBlock extends TeaModel {

    /**
     * Cidr Block唯一ID。
     */
    public String cidrBlockId;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * CIDR的类型。
     * 取值范围：IPV4、IPV6。
     */
    public String cidrBlockType;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * 可用的IP列表。
     */
    public List<String> availableIps;

    /**
     * 可用的IP数量。
     */
    public Integer availableIpCount;

}
