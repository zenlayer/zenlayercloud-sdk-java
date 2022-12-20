package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class DescribeCidrBlockIpsRequest extends TeaModel {

    /**
     * Cidr Block ID。
     */
    @Validation(required = true)
    public String cidrBlockId;

    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * IP。
     */
    public String ip;

}
