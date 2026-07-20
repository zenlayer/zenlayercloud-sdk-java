package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述区域内某高可用类型及其使用情况。
 */
public class HaTypeInfo extends TeaModel {


    /**
     * 高可用类型。
     */
    public String haType;

    /**
     * 该高可用类型是否已被使用。
     */
    public Boolean isUsed;

    public String getHaType() {
        return this.haType;
    }

    public void setHaType(String haType) {
        this.haType = haType;
    }

    public Boolean getIsUsed() {
        return this.isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

}