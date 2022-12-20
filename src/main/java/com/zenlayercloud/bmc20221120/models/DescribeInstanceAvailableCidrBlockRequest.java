package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class DescribeInstanceAvailableCidrBlockRequest extends TeaModel {

    /**
     * 实例ID。
     */
    @Validation(required = true)
    public String instanceId;

    /**
     * Cidr Block的类型。
     * 取值范围：IPV4、IPV6。
     */
    public String cidrBlockType;

}
