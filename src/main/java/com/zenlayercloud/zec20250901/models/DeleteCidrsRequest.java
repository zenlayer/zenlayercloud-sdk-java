package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteCidrsRequest extends TeaModel {


    /**
     * 要删除的cidrId列表
     */
    public List<String> cidrIds;

    public List<String> getCidrIds() {
        return this.cidrIds;
    }

    public void setCidrIds(List<String> cidrIds) {
        this.cidrIds = cidrIds;
    }

}