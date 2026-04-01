package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeResourceTagsRequest extends TeaModel {


    /**
     * 资源的唯一标识。
     */
    public String resourceUuid;

    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }

}