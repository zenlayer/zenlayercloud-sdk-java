package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyIPTransitsAttributeRequest extends TeaModel {


    /**
     * IP Transit ID 列表。
     * 最多支持 100 个。
     */
    public List<String> iptIds;

    /**
     * IP Transit名称。
     */
    public String iptName;

    /**
     * IP Transit描述。
     */
    public String iptDescription;

    public List<String> getIptIds() {
        return this.iptIds;
    }

    public void setIptIds(List<String> iptIds) {
        this.iptIds = iptIds;
    }

    public String getIptName() {
        return this.iptName;
    }

    public void setIptName(String iptName) {
        this.iptName = iptName;
    }

    public String getIptDescription() {
        return this.iptDescription;
    }

    public void setIptDescription(String iptDescription) {
        this.iptDescription = iptDescription;
    }

}