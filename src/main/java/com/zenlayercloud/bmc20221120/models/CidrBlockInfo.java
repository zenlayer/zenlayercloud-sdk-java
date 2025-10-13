package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class CidrBlockInfo extends TeaModel {

    /**
     * Cidr Block唯一ID。
     */
    public String cidrBlockId;

    /**
     * CIDR的类型。
     * 取值范围：IPV4、IPV6。
     */
    public String cidrBlockType;

    /**
     * Cidr Block名称。
     */
    public String cidrBlockName;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * 网关地址。
     */
    public String gateway;

    /**
     * 可用IP的开头。
     */
    public String availableIpStart;

    /**
     * 可用IP的结尾。
     */
    public String availableIpEnd;

    /**
     * 可用IP的数量。
     */
    public Integer availableIpCount;

    /**
     * 已绑定的实例ID列表。
     */
    public List<String> instanceIds;

    /**
     * 状态。
     */
    public String status;

    /**
     * 计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String expireTime;

    /**
     * 所属资源组的ID。
     */
    public String resourceGroupId;

    /**
     * 所属资源组的名称。
     */
    public String resourceGroupName;

    /**
     * 该CIDR关联的标签
     */
    public Tags tags;

}
