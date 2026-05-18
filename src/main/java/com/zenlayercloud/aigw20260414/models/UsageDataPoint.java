package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 用量数据点，包含时间戳和各模型的用量值
 */
public class UsageDataPoint extends TeaModel {


    /**
     * 时间戳（毫秒）。
     */
    public Long time;

    /**
     * 各模型的用量值列表。
     */
    public List<ModelValueItem> data;

    public Long getTime() {
        return this.time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<ModelValueItem> getData() {
        return this.data;
    }

    public void setData(List<ModelValueItem> data) {
        this.data = data;
    }

}