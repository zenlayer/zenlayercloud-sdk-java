package com.zenlayercloud.maintenance20250310.models;

import com.aliyun.tea.TeaModel;

public class MaintenanceAlertInfo extends TeaModel {
    public String instanceId;

    public String location;

    public String impact;

    public String startTime;

    public String endTime;

    public String status;
}
