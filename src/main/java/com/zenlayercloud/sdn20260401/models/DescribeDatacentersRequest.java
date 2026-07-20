package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeDatacentersRequest extends TeaModel {


    /**
     * 数据中心ID列表。
     */
    public List<String> dcIds;

    /**
     * 筛选是否支持新建数据中心端口的 DC（true：支持，false：不支持）。
     */
    public Boolean isPortAvailable;

    public List<String> getDcIds() {
        return this.dcIds;
    }

    public void setDcIds(List<String> dcIds) {
        this.dcIds = dcIds;
    }

    public Boolean getIsPortAvailable() {
        return this.isPortAvailable;
    }

    public void setIsPortAvailable(Boolean isPortAvailable) {
        this.isPortAvailable = isPortAvailable;
    }

}