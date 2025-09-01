package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeDisksRequest extends TeaModel {

    public List<String> diskIds;

    public String diskName;

    public String diskStatus;

    public String diskType;

    public String diskCategory;

    public String instanceId;

    public String zoneId;

    public Boolean snapshotAbility;

    public Integer pageSize;

    public Integer pageNum;

    public String resourceGroupId;
}
