package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 模型用量值项
 */
public class ModelValueItem extends TeaModel {


    /**
     * 模型名称。
     */
    public String model;

    /**
     * 用量值。
     */
    public Long value;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getValue() {
        return this.value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

}