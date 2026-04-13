package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCidrBlockIpsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 结果集。
     */
    public List<CidrBlockIp> cidrBlockIps;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<CidrBlockIp> getCidrBlockIps() {
        return this.cidrBlockIps;
    }

    public void setCidrBlockIps(List<CidrBlockIp> cidrBlockIps) {
        this.cidrBlockIps = cidrBlockIps;
    }

}