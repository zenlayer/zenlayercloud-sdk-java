package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class DescribeCidrsRequest extends TeaModel {
    @Validation
    public List<String> cidrIds;

    @Validation
    public String regionId;

    @Validation
    public String name;

    @Validation
    public String cidrBlock;

    @Validation
    public String source;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;

    public String resourceGroupId;
}
