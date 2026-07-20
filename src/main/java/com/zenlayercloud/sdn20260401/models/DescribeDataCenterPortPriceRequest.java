package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeDataCenterPortPriceRequest extends TeaModel {


    /**
     * 数据中心ID。
     * 可通过 ~~DescribeDataCenters~~ 接口获取。
     */
    public String dcId;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

}