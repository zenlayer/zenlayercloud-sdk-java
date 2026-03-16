package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeByoipPriceRequest extends TeaModel {


    /**
     * 待询价的 BYOIP 列表。
     */
    public List<ByoipPriceItem> byoipList;

    public List<ByoipPriceItem> getByoipList() {
        return this.byoipList;
    }

    public void setByoipList(List<ByoipPriceItem> byoipList) {
        this.byoipList = byoipList;
    }

}