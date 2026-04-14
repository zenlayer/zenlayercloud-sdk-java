package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


public class DescribeIPTransitDatacentersRequest extends TeaModel {


    /**
     * 指定端口ID。
     */
    public String peerPortId;

    /**
     * 指定数据中心ID。
     */
    public String peerDcId;

    public String getPeerPortId() {
        return this.peerPortId;
    }

    public void setPeerPortId(String peerPortId) {
        this.peerPortId = peerPortId;
    }

    public String getPeerDcId() {
        return this.peerDcId;
    }

    public void setPeerDcId(String peerDcId) {
        this.peerDcId = peerDcId;
    }

}