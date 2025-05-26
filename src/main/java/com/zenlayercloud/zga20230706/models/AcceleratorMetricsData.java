package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

public class AcceleratorMetricsData extends TeaModel {
    public Long requestCount;
    public Double averageDownloadSpeed;
    public Double averageFirstByteTime;
    public Double averageSslHandshakeTime;
    public Double averageRequestTime;
    public String time;
}
