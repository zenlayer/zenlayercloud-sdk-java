package com.zenlayercloud.alarm20250307.models;

import com.aliyun.tea.TeaModel;

public class IpBlockEventInfo extends TeaModel {
    public String ip;

    public String region;

    public String resourceGroup;

    public String blockTime;

    public String unblockTime;

    public String divertMode;
}
