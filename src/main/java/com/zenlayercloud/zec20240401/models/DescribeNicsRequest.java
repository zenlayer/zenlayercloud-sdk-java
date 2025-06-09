package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.Set;

public class DescribeNicsRequest extends TeaModel {
    @Validation(maxLength = 100)
    public Set<String> nicIds;

    @Validation
    public String name;

    @Validation
    public String regionId;

    @Validation
    public String vpcId;

    @Validation
    public String subnetId;

    @Validation
    public String instanceId;

    @Validation
    public String status;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;
}
