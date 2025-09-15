/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.Map;

/**
 * @author otis.lin
 * @date 2024-03-13 10:11:00
 * @version $ Id: AcceleratorAlert.java, v 0.1 otis.lin Exp $
 */
public class AcceleratorAlert extends TeaModel {
    public String acceleratorId;
    public String alertId;
    public String alertType;
    public Map<String, String> labels;
    public String message;
    public String startTime;
    public String endTime;
}
