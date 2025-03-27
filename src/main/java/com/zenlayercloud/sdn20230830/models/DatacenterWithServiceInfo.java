package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DatacenterWithServiceInfo extends TeaModel {
    public String dcId;

    public String dcName;

    public String areaName;

    public String cityName;

    public String cloudRegionId;

    public List<String> serviceTypes;

    public Double latitude;

    public Double longitude;
}
