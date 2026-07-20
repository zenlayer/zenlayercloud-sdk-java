package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePortUsableVlanResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * VLAN 范围起始值。
     */
    public Integer start;

    /**
     * VLAN 范围结束值。
     */
    public Integer end;

    /**
     * 占用中的 VLAN 列表。
     */
    public List<Integer> inuseVlanList;

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

    public List<Integer> getInuseVlanList() {
        return this.inuseVlanList;
    }

    public void setInuseVlanList(List<Integer> inuseVlanList) {
        this.inuseVlanList = inuseVlanList;
    }

}