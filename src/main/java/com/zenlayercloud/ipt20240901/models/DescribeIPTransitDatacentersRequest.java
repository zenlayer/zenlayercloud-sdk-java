package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeIPTransitDatacentersRequest extends TeaModel {


    /**
     * 对端数据中心端口 ID。
     * 传入时查询以该数据中心端口为接入侧的可连接数据中心列表。
     */
    public String peerPortId;

    /**
     * 对端数据中心 ID。
     */
    public String peerDcId;

    /**
     * ZBG 接入节点 ID。
     * 非空时查询以该 ZBG 节点为接入侧的 Router RIPT 可连接 DC 列表。
     */
    public String zbgRegionId;

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

    public String getZbgRegionId() {
        return this.zbgRegionId;
    }

    public void setZbgRegionId(String zbgRegionId) {
        this.zbgRegionId = zbgRegionId;
    }

}