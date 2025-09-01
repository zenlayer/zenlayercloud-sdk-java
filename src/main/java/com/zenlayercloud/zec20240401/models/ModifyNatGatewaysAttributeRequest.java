package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyNatGatewaysAttributeRequest extends TeaModel {


    /**
     */
    public List<String> natIds;

    /**
     */
    public String name;

    public List<String> getNatIds() {
        return this.natIds;
    }

    public void setNatIds(List<String> natIds) {
        this.natIds = natIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}