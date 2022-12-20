package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class DescribeCidrBlocksRequest extends TeaModel {

    /**
     * Cidr Block ID。
     * 最多支持100个ID查询。
     */
    public List<String> cidrBlockIds;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * Cidr Block名称。
     */
    public String cidrBlockName;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * Cidr Block的类型。
     * 取值范围：IPV4、IPV6。
     */
    public String cidrBlockType;

    /**
     * 网关地址。
     */
    public String gateway;

    /**
     * 计费类型。
     * PREPAID：预付费，即包年包月。
     * POSTPAID：后付费。
     */
    public String chargeType;

    /**
     * 资源组的ID。
     * 如果不传，则返回该用户可见的所有资源组内的实例。
     */
    public String resourceGroupId;

    /**
     * 返回的分页数。
     * 默认为1
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20。最大为1000
     */
    public Integer pageSize;

}
