package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeVPCDatacentersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 结果集。
     */
    public List<DataCenterAssemble> dcSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DataCenterAssemble> getDcSet() {
        return this.dcSet;
    }

    public void setDcSet(List<DataCenterAssemble> dcSet) {
        this.dcSet = dcSet;
    }

}