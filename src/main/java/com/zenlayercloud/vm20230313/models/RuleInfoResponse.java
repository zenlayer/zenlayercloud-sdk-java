/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:19:49
 * @version $ Id: RuleInfo.java, v 0.1  alicat.xu Exp $
 */
public class RuleInfoResponse extends TeaModel {

    /**
     * 规则方向
     */
    public String direction;

    /**
     * 访问权限
     */
    public String policy;

    /**
     * 规则优先级
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
}
