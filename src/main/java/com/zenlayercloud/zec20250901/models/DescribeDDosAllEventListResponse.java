package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 攻击事件列表。
 */
public class DescribeDDosAllEventListResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 攻击事件列表的数据
     */
    public List<AttackEventInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AttackEventInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<AttackEventInfo> dataSet) {
        this.dataSet = dataSet;
    }

}