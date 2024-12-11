package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.Set;

public class DescribeInstancesRequest extends TeaModel {
    public Set<String> instanceIds;

    public String zoneId;

    public String imageId;

    public String status;

    public String name;

    public String ipv4Address;

    public String ipv6Address;

    public Integer pageSize;

    public Integer pageNum;
}
