package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSecurityGroupsRequest extends TeaModel {
    public List<String> securityGroupIds;

    public String securityGroupName;

    public Integer pageSize;

    public Integer pageNum;
}
