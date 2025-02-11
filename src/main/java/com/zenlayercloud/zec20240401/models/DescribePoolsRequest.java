package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class DescribePoolsRequest extends TeaModel {
    @Validation
    public List<String> poolIds;

    public String regionId;

    public String name;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;
}
