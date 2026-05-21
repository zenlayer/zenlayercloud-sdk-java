package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyHaVipAttributeRequest extends TeaModel {


    /**
     * 高可用虚拟IP的ID。
     */
    public String haVipId;

    /**
     * HaVip名称。
     * 长度1到64个字符。
     */
    public String name;

    public String getHaVipId() {
        return this.haVipId;
    }

    public void setHaVipId(String haVipId) {
        this.haVipId = haVipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}