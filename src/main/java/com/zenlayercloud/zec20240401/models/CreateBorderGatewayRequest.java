package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateBorderGatewayRequest extends TeaModel {
    public String       regionId;
    public String       vpcId;
    public String       label;
    public Integer      asn;
    public String       advertisedSubnet;
    public List<String> advertisedCidrs;
    public String       routingMode;

}
