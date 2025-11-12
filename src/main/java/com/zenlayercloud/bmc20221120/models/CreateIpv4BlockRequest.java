package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class CreateIpv4BlockRequest extends TeaModel {

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
     * 付费类型。
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费。
     */
    @Validation(required = true)
    public String chargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。
     * 通过该参数可以指定包年包月实例的购买时长等属性。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    @Validation
    public ChargePrePaid chargePrepaid;

    /**
     * 购买的掩码。
     */
    @Validation(required = true, minimum = 1, maximum = 32)
    public Integer netmask;

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

    public MarketingInfo marketingOptions;

    /**
     * 创建CIDR时关联的标签。
     * 注意：关联`标签键`不能重复
     */
    public TagAssociation tags;
}
