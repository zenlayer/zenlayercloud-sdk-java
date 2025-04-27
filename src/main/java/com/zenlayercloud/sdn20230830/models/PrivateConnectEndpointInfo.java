package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class PrivateConnectEndpointInfo extends TeaModel {

    public String dcId;

    public String portType;

    public Boolean buildCrossConnectWithAssisted;

    public String cloudType;

    public Integer vlanId;

    public String cloudRegionId;

    public Integer bandwidthMbps;
}
