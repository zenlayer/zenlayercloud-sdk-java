package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 日用量条目。
 */
public class DailyMetricItem extends TeaModel {


    /**
     * 日期，格式：yyyy-MM-dd。
     */
    public String date;

    /**
     * 各模型用量列表。
     */
    public List<ModelDailyUsage> model_usage;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ModelDailyUsage> getModel_usage() {
        return this.model_usage;
    }

    public void setModel_usage(List<ModelDailyUsage> model_usage) {
        this.model_usage = model_usage;
    }

}