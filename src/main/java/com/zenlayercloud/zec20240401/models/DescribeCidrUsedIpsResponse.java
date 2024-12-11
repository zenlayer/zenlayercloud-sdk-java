package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCidrUsedIpsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String       requestId;
    public List<CidrUsedIpInfo> dataSet;
    public Integer totalCount;

    public static class CidrUsedIpInfo extends TeaModel {
        public String publicIp;
        public String lanIp;
        public String nicId;
        public String nicName;
        public String instanceId;
        public String instanceName;
    }
}
