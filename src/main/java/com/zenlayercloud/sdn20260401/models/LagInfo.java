package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 数据中心端口归属的 LAG 信息。
 */
public class LagInfo extends TeaModel {


    /**
     * LAG ID。
     */
    public String lagId;

    /**
     * LAG 名称。
     */
    public String lagName;

    public String getLagId() {
        return this.lagId;
    }

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    public String getLagName() {
        return this.lagName;
    }

    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

}