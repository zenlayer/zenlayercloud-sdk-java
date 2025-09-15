package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更弹性公网IP更网络计费模式的请求参数。
 */
public class ChangeEipInternetChargeTypeRequest extends TeaModel {


    /**
     * 要操作的公网弹性IP
     */
    public String eipId;

    /**
     * 要变更的目标网络计费类型
     */
    public String internetChargeType;

    /**
     * 共享带宽包ID。
     * 如果要变更为共享带宽包计费，则需要指定
     */
    public String clusterId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

}