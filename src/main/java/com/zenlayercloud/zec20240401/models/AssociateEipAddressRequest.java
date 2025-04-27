package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AssociateEipAddressRequest extends TeaModel {
    public String loadBalancerId;
    public List<String> eipIds;
}
