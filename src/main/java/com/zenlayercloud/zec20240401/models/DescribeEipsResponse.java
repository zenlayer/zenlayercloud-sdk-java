package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String         requestId;
    public List<EipInfo>  dataSet;
    public Integer        totalCount;


    public static class EipInfo extends TeaModel {
        public String eipId;

        public String name;

        public String regionId;

        public String peerRegionId;

        public Boolean isDefault;

        public String status;

        public List<String> publicIpAddresses;

        public String eipV4Type;

        public String internetChargeType;

        public String cidrId;

        public String nicId;

        public Double flowPackage;

        public Integer bandwidth;

        public String createTime;

        public String expiredTime;

        public String resourceGroupId;

        public String resourceGroupName;
    }
}
