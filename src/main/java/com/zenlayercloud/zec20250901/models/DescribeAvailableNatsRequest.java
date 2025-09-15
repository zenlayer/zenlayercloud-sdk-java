package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 请求可用NAT网关的请求信息。
 */
public class DescribeAvailableNatsRequest extends TeaModel {


    /**
     * 要查询需要绑定的边界网关ID
     */
    public String zbgId;

    public String getZbgId() {
        return this.zbgId;
    }

    public void setZbgId(String zbgId) {
        this.zbgId = zbgId;
    }

}