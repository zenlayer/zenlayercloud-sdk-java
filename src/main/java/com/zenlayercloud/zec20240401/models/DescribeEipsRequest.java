package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipsRequest extends TeaModel {
    public List<String> eipIds;

    public String regionId;

    public String name;

    public String status;

    public Boolean isDefault;

    public Integer pageSize;

    public Integer pageNum;

    public String privateIpAddress;

    public String ipAddress;

    public String instanceId;

    public String associatedId;
}
