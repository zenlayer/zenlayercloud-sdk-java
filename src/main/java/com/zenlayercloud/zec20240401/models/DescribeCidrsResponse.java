package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCidrsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String       requestId;
    public List<CidrInfo> dataSet;
    public Integer totalCount;

    public static class CidrInfo extends TeaModel {
        public String       cidrId;
        public String       regionId;
        public String       name;
        public String       cidrBlock;
        public Integer      totalCount;
        public Integer      usedCount;
        public String       source;
        public String       eipV4Type;
        public Integer      netmask;
        public String       createTime;
        public String       expiredTime;
        public String       resourceGroupId;
        public String       resourceGroupName;
    }
}
