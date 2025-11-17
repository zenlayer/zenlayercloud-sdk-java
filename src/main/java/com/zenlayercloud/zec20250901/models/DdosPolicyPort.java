package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DdosPolicyPort extends TeaModel {


    /**
     * 协议类型。
     * 只支持 `UDP` / `TCP` 两种协议
     */
    public String protocol;

    /**
     * 源端口范围的起始值
     */
    public Integer srcPortStart;

    /**
     * 源端口范围的结束值
     */
    public Integer srcPortEnd;

    /**
     * 目的端口范围的起始值
     */
    public Integer dstPortStart;

    /**
     * 目的端口范围的结束值
     */
    public Integer dstPortEnd;

    /**
     * 匹配后的动作
     */
    public String action;

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Integer getSrcPortStart() {
        return this.srcPortStart;
    }

    public void setSrcPortStart(Integer srcPortStart) {
        this.srcPortStart = srcPortStart;
    }

    public Integer getSrcPortEnd() {
        return this.srcPortEnd;
    }

    public void setSrcPortEnd(Integer srcPortEnd) {
        this.srcPortEnd = srcPortEnd;
    }

    public Integer getDstPortStart() {
        return this.dstPortStart;
    }

    public void setDstPortStart(Integer dstPortStart) {
        this.dstPortStart = dstPortStart;
    }

    public Integer getDstPortEnd() {
        return this.dstPortEnd;
    }

    public void setDstPortEnd(Integer dstPortEnd) {
        this.dstPortEnd = dstPortEnd;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}