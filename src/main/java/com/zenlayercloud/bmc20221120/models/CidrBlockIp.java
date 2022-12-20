package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class CidrBlockIp extends TeaModel {

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
     * IP。
     */
    public String ip;

    /**
     * 绑定的实例ID。
     */
    public String instanceId;

    /**
     * 状态。
     */
    public String status;

}
