package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyBorderGatewaysAttributeRequest extends TeaModel {
    public List<String> zbgIds;

    public String name;

    public String advertisedSubnet;

    public List<String> advertisedCidrs;
}
