package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述一个标签键值对的信息。
 */
public class Tag extends TeaModel {


    /**
     * 标签键。
     * 长度限制：1～64个字符
     */
    public String key;

    /**
     * 标签值。
     * 长度限制：1～64个字符
     */
    public String value;

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

}