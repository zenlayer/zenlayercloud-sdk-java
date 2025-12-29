package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述解析来源的信息。
 */
public class LineInfo extends TeaModel {


    /**
     * 解析来源。
     * `default` 为默认，即全局。
     * 也可以指定某个节点ID，例如asia-east-1
     */
    public String line;

    /**
     * 如果解析来源为节点，则该字段为节点所属的城市名称
     */
    public String city;

    public String getLine() {
        return this.line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}