/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import java.util.List;

import com.aliyun.tea.TeaModel;

/**
 * @author otis.lin
 * @date 2024-03-13 10:11:00
 * @version $ Id: DescribeAcceleratorsAlertsRequest.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorsAlertsRequest extends TeaModel {
        public List<String> acceleratorIds;
        public String resourceGroupId;
        public String alertType;
        public String alertId;
        public Boolean firing;
        public String startTimeFrom;
        public String startTimeTo;
        public String endTimeFrom;
        public String endTimeTo;
        public Integer pageSize;
        public Integer pageNum;
}