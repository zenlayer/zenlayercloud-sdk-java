/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.sdn20230830.HAType;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-11-22 19:52:41
 * @version $ Id: CloudRegion.java, v 0.1  wolfgang Exp $
 */
public class CloudRegion extends TeaModel {

    public String         cloudRegionId;
    public DatacenterInfo dataCenter;
    public List<String>   products;
    public List<HAType>   haTypes;

}
