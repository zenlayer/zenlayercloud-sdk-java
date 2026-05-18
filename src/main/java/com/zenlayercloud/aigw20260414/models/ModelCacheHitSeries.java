package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述模型日缓存命中率信息。
 */
public class ModelCacheHitSeries extends TeaModel {


    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 模型日缓存命中率列表，格式如 "90%"。
     */
    public List<String> data;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<String> getData() {
        return this.data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

}