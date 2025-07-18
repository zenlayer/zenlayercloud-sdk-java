package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstancesStatusRequest extends TeaModel {

    public List<String> instanceIds;

    public Integer pageSize;

    public Integer pageNum;

    public String resourceGroupId;
}
