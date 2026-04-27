package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeMemberGroupsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * 成员组列表信息。
     */
    public List<MemberGroup> dataSet;

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

    public List<MemberGroup> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<MemberGroup> dataSet) {
        this.dataSet = dataSet;
    }

}