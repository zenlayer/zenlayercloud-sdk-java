/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:36:44
 * @version $ Id: ModifyCloudRoutersAttributeRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyCloudRoutersAttributeRequest extends TeaModel {

    /**
     * 三层网络的ID列表。
     */
    public List<String> cloudRouterIds;

    /**
     * 三层网络的名称。
     */
    public String cloudRouterName;

    /**
     * 三层网络的描述信息。
     */
    public String cloudRouterDescription;
}
