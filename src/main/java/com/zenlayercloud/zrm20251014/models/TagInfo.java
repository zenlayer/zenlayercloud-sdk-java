package com.zenlayercloud.zrm20251014.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述标签的基本信息
 */
public class TagInfo extends TeaModel {


    /**
     * 标签键
     */
    public String key;

    /**
     * 标签值
     */
    public String value;

    /**
     * 标签下绑定的资源总数
     */
    public Integer bindResourceCount;

    /**
     * 创建时间
     */
    public String createdDate;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getBindResourceCount() {
        return this.bindResourceCount;
    }

    public void setBindResourceCount(Integer bindResourceCount) {
        this.bindResourceCount = bindResourceCount;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

}