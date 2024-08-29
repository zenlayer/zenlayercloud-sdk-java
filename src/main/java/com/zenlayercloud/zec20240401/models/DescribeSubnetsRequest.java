package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.Set;

public class DescribeSubnetsRequest extends TeaModel {
    @Validation(maxLength = 100)
    public Set<String> subnetIds;

    @Validation
    public String name;

    @Validation
    public String cidrBlock;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;


}
