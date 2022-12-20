package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class CreateIpv6BlockRequest extends TeaModel {

    /**
     * Cidr Block所属的可用区ID。
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * Cidr Block名称。
     */
    @Validation(minLength = 1, maxLength = 64)
    public String name;

    /**
     * 购买的数量。
     * 默认为1。
     */
    @Validation(minimum = 1)
    public Integer amount;

    /**
     * Cidr Block所属的资源组ID。
     */
    public String resourceGroupId;

}
