


/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;


import com.aliyun.tea.TeaModel;
import com.zenlayercloud.sdn20230830.models.DatacenterInfo;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-07-18 20:55:28
 * @version $ Id: ModifyPrivateConnectBandwidthRequest.java, v 0.1  wolfgang Exp $
 */
public class DescribeIPTransitDatacentersResponse extends TeaModel {

    public List<IpTransitDatacenter> supportSet;

    public static class IpTransitDatacenter extends TeaModel {
        public DatacenterInfo                      dataCenter;
        public List<RemoteIptAvailableRoutingType> availableRoutingTypes;
    }

    public static class RemoteIptAvailableRoutingType extends TeaModel {

        public String routingType;
        public String deliveryType;

    }
}
