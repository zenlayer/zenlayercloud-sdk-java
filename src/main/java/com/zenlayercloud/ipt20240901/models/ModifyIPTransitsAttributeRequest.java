package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyIPTransitsAttributeRequest extends TeaModel {


    /**
     * IP Transit ID 列表。
     * 数量不得超过100。
     */
    public List<String> iptIds;

    /**
     * IP Transit名称。
     * 不得超过255个字符。
     * 名称和描述信息至少需要有一项指定。
     */
    public String iptName;

    /**
     * IP Transit 描述信息。
     * 名称和描述信息至少需要有一项指定。
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