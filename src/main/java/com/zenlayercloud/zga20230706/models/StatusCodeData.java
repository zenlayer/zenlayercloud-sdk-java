/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.math.BigInteger;
import java.util.List;

/**
 * @author otis.lin
 * @date 2025-11-24 17:56:00
 * @version $ Id: StatusCodeData.java, v 0.1 otis.lin Exp $
 */
public class StatusCodeData extends TeaModel {
    public String time;

    public List<StatusCodeDetailData> detail;
}

