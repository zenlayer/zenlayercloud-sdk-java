package com.zenlayercloud.mcpgw20260602.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述MCP网关按月计费明细项。
 */
public class BillingItem extends TeaModel {


    /**
     * MCP网关uuid。
     */
    public String gatewayUuid;

    /**
     * MCP网关名称。
     */
    public String gatewayName;

    /**
     * 用量日期，格式 yyyy-MM-dd。
     */
    public String date;

    /**
     * 计量单位。
     */
    public String unit;

    /**
     * 用量（字符串，保留精度）。
     */
    public String usage;

    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 单价（字符串，保留精度）。
     */
    public String unitPrice;

    /**
     * 原价（字符串，保留精度）。
     */
    public String originalPrice;

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
    }

    public String getGatewayName() {
        return this.gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUsage() {
        return this.usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

}