package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 操作详情。
 */
public class OperationInfo extends TeaModel {


    /**
     * 操作动作。取值范围：`ModifyBandwidth`（调整带宽）、`ModifyFlowPackage`（调整流量包）。
     */
    public String operation;

    /**
     * 操作状态。取值范围：`OPERATING`（操作中）、`FAILED`（操作失败）。
     */
    public String status;

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}