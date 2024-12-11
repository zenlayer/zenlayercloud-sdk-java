package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstancesStatusResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public Integer totalCount;

    public List<InstanceStatus> dataSet;

    public static class InstanceStatus extends TeaModel {
        public String instanceId;
        public String instanceStatus;
    }
}
