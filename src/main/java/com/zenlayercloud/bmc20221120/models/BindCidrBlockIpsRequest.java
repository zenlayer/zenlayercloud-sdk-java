package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class BindCidrBlockIpsRequest extends TeaModel {

    /**
     * 待操作的Cidr Block ID。
     */
    @Validation(required = true)
    public String cidrBlockId;

    /**
     * 待绑定的IP列表。
     */
    @Validation(required = true, minLength = 1, maxLength = 100)
    public List<IpBindParam> ipBindList;

}
