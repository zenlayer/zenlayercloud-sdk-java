/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2025 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ZbgInfo extends TeaModel {
    public String       zbgId;
    public String       name;
    public String       vpcId;
    public String       regionId;
    public Integer      asn;
    public String       interConnectCidr;
    public String       createTime;
    public List<String> cloudRouterIds;
    public String       advertisedSubnet;
    public String       routingMode;
    public List<String> advertisedCidrs;
    public List<String> advertisedRouteIds;
    public String       natId;

}