package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * LoadBalancerSpec 信息
 */
public class LoadBalancerSpec extends TeaModel {


    /**
     * 规格名称。
     */
    public String specName;

    /**
     * 最大连接数。
     */
    public Integer maxConnection;

    /**
     * CPS。
     */
    public Integer cps;

    /**
     * QPS。
     */
    public Integer qps;

    public String getSpecName() {
        return this.specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Integer getMaxConnection() {
        return this.maxConnection;
    }

    public void setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
    }

    public Integer getCps() {
        return this.cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    public Integer getQps() {
        return this.qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

}