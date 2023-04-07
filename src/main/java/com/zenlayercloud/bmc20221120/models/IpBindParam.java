package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author Zif
 * @date 2023/2/17
 */
public class IpBindParam extends TeaModel {

    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * IP。
     * 可通过DescribeInstanceAvailableCidrBlock接口返回值中的availableIps获取。
     */
    public String ip;

}
