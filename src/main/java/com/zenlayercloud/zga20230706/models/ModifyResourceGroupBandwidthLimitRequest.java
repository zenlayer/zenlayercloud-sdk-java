/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author otis.lin
 * @date 2025-07-17 14:28:00
 * @version $ Id: ModifyResourceGroupBandwidthLimitRequest.java, v 0.1  otis.lin Exp $
 */
public class ModifyResourceGroupBandwidthLimitRequest extends TeaModel {

    @Validation(required = true)
    public String resourceGroupId;

    @Validation(required = true)
    public Boolean enable;

    @Validation(required = true, minimum = 1)
    public Integer bandwidth;
}
