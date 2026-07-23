package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 指定掩码长度下当前可创建的网段数量。
 */
public class AvailableCidrInfo extends TeaModel {


    /**
     * 掩码长度。
     */
    public Integer prefixLength;

    /**
     * 该掩码长度下当前可创建的网段数量。
     */
    public Integer count;

    public Integer getPrefixLength() {
        return this.prefixLength;
    }

    public void setPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}