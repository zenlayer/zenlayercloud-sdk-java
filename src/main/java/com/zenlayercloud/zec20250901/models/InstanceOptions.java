package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述实例选项相关配置。
 */
public class InstanceOptions extends TeaModel {


    /**
     * 是否启用嵌套虚拟化。
     * 如果要开启嵌套虚拟化，需要联系Support开通,否则设置无效。
     */
    public Boolean nestedVirtualization;

    public Boolean getNestedVirtualization() {
        return this.nestedVirtualization;
    }

    public void setNestedVirtualization(Boolean nestedVirtualization) {
        this.nestedVirtualization = nestedVirtualization;
    }

}