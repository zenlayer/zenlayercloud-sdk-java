package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeServiceCityResponse extends TeaModel {
    public String requestId;
    public List<Zone> zones;

    public DescribeServiceCityResponse() {
    }

    public static class Zone extends TeaModel {
        public String zoneName;
        public String zoneCode;
        public String cityCode;
    }
}
