/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wolfgang
 * @date 2022-11-09 20:21:03
 * @version $ Id: CreateInstanceRequest.java, v 0.1  wolfgang Exp $
 */
public class CreateInstancesRequest extends TeaModel {
    /**
     * 实例所属的可用区ID。
     */
    @Validation(required = true)
    public String          zoneId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月 POSTPAID：后付费
     */
    @Validation(required = true)
    public String          instanceChargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrePaid   instanceChargePrepaid;

    /**
     * 实例机型ID。
     * 具体取值可通过调用接口DescribeInstanceTypes来获得最新的规格表。
     */
    @Validation(required = true)
    public String          instanceTypeId;

    /**
     * 指定有效的镜像ID。
     * 可通过以下方式获取可用的镜像ID：通过调用接口 DescribeImages ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的ImageId字段。 也可以不指定镜像，如果不指定镜像，后续可以通过IPMI进行安装。
     */
    public String          imageId;

    /**
     * IpxeUrl。
     * 传入参数后，imageId不生效。
     */
    public String          ipxeUrl;

    /**
     * 实例所在的资源组ID。
     */
    public String          resourceGroupId;

    /**
     * 实例显示名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     * 购买多台实例，可以指定模式串[begin_number,bits]。begin_number：有序数值的起始值，取值支持[0,99999]，默认值为0。bits：有序数值所占的位数，取值支持[1,
     * 6]，默认值为6。注意模式串中不得有空格。购买1台时，例如server_[3,3]实例显示为server003；购买2台时，实例显示名分别为server003，server004。支持指定多个模式串，如server_[3,3]_[1,1]。
     * 默认值为 instance。
     */
    public String          instanceName;

    /**
     * 实例的主机名。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.) 。
     * 购买多台实例，可以指定模式串[begin_number,bits]。begin_number：有序数值的起始值，取值支持[0,99999]，默认值为0。bits：有序数值所占的位数，取值支持[1,
     * 6]，默认值为6。注意模式串中不得有空格。购买1台时，例如server_[3,3]主机名为server003；购买2台时，实例主机名分别为server003，server004。支持指定多个模式串，如server_[3,3]_[1,1]。
     * 默认值为hostname。
     */
    public String          hostname;

    /**
     * 指定创建实例的数量。
     * 取值范围：1~100。 默认值：1。
     */
    @Validation(minimum = 1, maximum = 100)
    public Integer         amount = 1;

    /**
     * 实例的密码。
     * 必须是 8-16 个字符，包含大写字母、小写字母、数字和特殊字符。特殊符号可以是：1~!@$^*-_=+。该密码也是作为IPMI登录的密码。请妥善保管。
     * 密钥与密码必须并且只能指定其中一个。
     */
    @Validation(minLength = 8, maxLength = 16)
    public String          password;

    /**
     * 密钥列表。
     * 密钥与密码不能同时指定。 使用了密钥登录，密码登录将会被禁止。 密钥最多支持5个。 Windowsh和exsi操作系统的实例 ，忽略该参数。默认为空。即使填写了该参数，仍旧只执行password的内容。
     * 如果imageId未指定，则会忽略该参数。
     */
    public List<String>    sshKeys;

    /**
     * 网络计费类型。
     * 取值范围请看InternetChargeType。
     */
    @Validation(required = true)
    public String          internetChargeType;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。默认值：1Mbps。不同机型带宽上限范围不一致，具体限制详见购买网络带宽。
     */
    @Validation(minimum = 1)
    public Integer         internetMaxBandwidthOut;

    /**
     * 流量包订购大小。
     * 单位为TB。该值仅限当 internetChargeType = ByTrafficPackage 生效。
     * 如果没有传则会默认以赠送的流量包大小。
     */
    @Validation(minimum = 0)
    public BigDecimal      trafficPackageSize;

    /**
     * 虚拟子网ID 。
     * 您可以调用DescribeVpcSubnets查询已创建的交换机的相关信息。
     */
    public String          subnetId;

    /**
     * 磁盘阵列配置。
     */
    public RaidConfig      raidConfig;

    /**
     * 分区配置。
     * 如果未安装操作系统，将不能设置分区。
     */
    public List<Partition> partitions;

    /**
     * 网卡配置信息，包括公网和内网名称等。
     */
    public Nic             nic;

    /**
     * 是否启用实例主IPv6。
     * false为不启用主IPv6，此时将不能为实例配置弹性IPv6。默认为true。
     */
    public Boolean enablePrimaryIPv6;

}
