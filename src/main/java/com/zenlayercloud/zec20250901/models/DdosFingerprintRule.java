package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DdosFingerprintRule extends TeaModel {


    /**
     * 设置指纹的协议
     */
    public String protocol;

    /**
     * 指纹源端口的范围起始值
     */
    public Integer srcPortStart;

    /**
     * 指纹源端口的范围结束值
     */
    public Integer srcPortEnd;

    /**
     * 指纹目的端口的范围起始值
     */
    public Integer dstPortStart;

    /**
     * 指纹目的端口的范围结束值
     */
    public Integer dstPortEnd;

    /**
     * 需要过滤出的最小包长
     */
    public Integer minPktLength;

    /**
     * 需要过滤出的最大包长
     */
    public Integer maxPktLength;

    /**
     * 报文载荷特征的偏移量。
     * TCP/UDP payload 的偏移 [0-1500]
     */
    public Integer offset;

    /**
     * 检测载荷。
     * 不含0x 的16进制 小写 补足2位
     */
    public String matchBytes;

    /**
     * 设置指纹匹配后的动作
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

    public Integer getMinPktLength() {
        return this.minPktLength;
    }

    public void setMinPktLength(Integer minPktLength) {
        this.minPktLength = minPktLength;
    }

    public Integer getMaxPktLength() {
        return this.maxPktLength;
    }

    public void setMaxPktLength(Integer maxPktLength) {
        this.maxPktLength = maxPktLength;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getMatchBytes() {
        return this.matchBytes;
    }

    public void setMatchBytes(String matchBytes) {
        this.matchBytes = matchBytes;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}