package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述模型日费用信息。
 */
public class ModelCostSeries extends TeaModel {


    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 模型日费用列表。
     */
    public List<Double> data;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<Double> getData() {
        return this.data;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }

}