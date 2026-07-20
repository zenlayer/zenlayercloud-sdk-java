package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeTencentVlanUsageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用的 VLAN 范围起始值。
     */
    public Integer start;

    /**
     * 可用的 VLAN 范围结束值。
     */
    public Integer end;

    /**
     * 已使用的 VLAN 列表。
     */
    public List<Integer> usedVlans;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getStart() {
        return this.start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return this.end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public List<Integer> getUsedVlans() {
        return this.usedVlans;
    }

    public void setUsedVlans(List<Integer> usedVlans) {
        this.usedVlans = usedVlans;
    }

}