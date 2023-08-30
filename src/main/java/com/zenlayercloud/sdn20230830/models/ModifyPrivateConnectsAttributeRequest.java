/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:40:55
 * @version $ Id: ModifyPrivateConnectsAttributeRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyPrivateConnectsAttributeRequest extends TeaModel {

    /**
     * 二层网络专线的ID列表。
     * 数量不得超过100。
     */
    public List<String> privateConnectIds;

    /**
     * 二层网络专线的名称。
     */
    public String privateConnectName;
}
