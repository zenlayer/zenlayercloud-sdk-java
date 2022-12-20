package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class CreateIpv4BlockResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 订单编号。
     */
    public String orderNumber;

    /**
     * Cidr Block ID列表。
     */
    public List<String> cidrBlockIds;

}
