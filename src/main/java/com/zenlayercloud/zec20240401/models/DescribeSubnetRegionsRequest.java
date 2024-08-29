package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class DescribeSubnetRegionsRequest extends TeaModel {
    @Validation
    public List<String> regionIds;
}
