package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBorderGatewaysRequest extends TeaModel {
    public List<String> zbgIds;

    public String name;

    public String regionId;

    public String vpcId;

    public Integer pageSize;

    public Integer pageNum;
}
