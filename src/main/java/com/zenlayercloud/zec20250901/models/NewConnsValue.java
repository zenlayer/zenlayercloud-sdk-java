package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述新建连接数（CPS）监控指标的数据值。
 */
public class NewConnsValue extends TeaModel {


    /**
     * 数据点时间。
     */
    public String time;

    /**
     * All（入+出之和）的值。
     * 如果该值为null,表示取不到相应的值。
     */
    public Double allValue;

    /**
     * In（入方向）的值。
     * 如果该值为null,表示取不到相应的值。
     */
    public Double inValue;

    /**
     * Out（出方向）的值。
     * 如果该值为null,表示取不到相应的值。
     */
    public Double outValue;

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getAllValue() {
        return this.allValue;
    }

    public void setAllValue(Double allValue) {
        this.allValue = allValue;
    }

    public Double getInValue() {
        return this.inValue;
    }

    public void setInValue(Double inValue) {
        this.inValue = inValue;
    }

    public Double getOutValue() {
        return this.outValue;
    }

    public void setOutValue(Double outValue) {
        this.outValue = outValue;
    }

}