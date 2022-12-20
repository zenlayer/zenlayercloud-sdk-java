package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class DescribeAvailableIpv4ResourcesRequest extends TeaModel {

    /**
     * 计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    @Validation(required = true)
    public String chargeType;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

}
