package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeVirtualEdgeDatacentersRequest extends TeaModel {


    /**
     * 主数据中心 ID。
     * IPSec 接入类型且需要高可用时，用于过滤可用备机房。
     */
    public String primaryDcId;

    public String getPrimaryDcId() {
        return this.primaryDcId;
    }

    public void setPrimaryDcId(String primaryDcId) {
        this.primaryDcId = primaryDcId;
    }

}