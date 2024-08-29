package com.zenlayercloud.zbc20240808.models;

import com.aliyun.tea.TeaModel;

public class DescribeBillDetailRequest extends TeaModel {
    /**
     * 页码，默认1
     */
    public Integer pageNum;

    /**
     * 每页大小不能超过5000,超过5000返回5000条
     */
    public Integer pageSize;

    /**
     * 账单月份，默认当前月。格式yyyyMM
     */
    public Integer billMonthly;

    /**
     * 订单号
     */
    public String orderSn;

    /**
     * 资源ID（实例ID）
     */
    public String resourceId;
}
