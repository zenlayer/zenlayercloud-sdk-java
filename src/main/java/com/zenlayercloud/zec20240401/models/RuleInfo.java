package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

public class RuleInfo extends TeaModel {
    /**
     * 规则方向
     */
    public String direction;

    /**
     * 访问权限
     */
    public String policy;

    /**
     * 优先级
     */
    public Integer priority;

    /**
     * 传输层协议
     */
    public String ipProtocol;

    /**
     * 端口范围
     */
    public String portRange;

    /**
     * 源端IP地址范围
     */
    public String cidrIp;

    public String desc;
}
