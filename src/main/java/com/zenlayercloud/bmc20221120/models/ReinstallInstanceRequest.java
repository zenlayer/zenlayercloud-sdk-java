/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2022/12/20
 */
public class ReinstallInstanceRequest extends TeaModel {

    /**
     * 需要进行重装的实例ID
     */
    @Validation(required = true)
    public String instanceId;

    /**
     * 指定有效的镜像ID
     * 可通过以下方式获取可用的镜像ID:
     * 通过调用接口 DescribeImages, 传入InstanceType获取当前机型支持的镜像列表，取返回信息中的ImageId字段。
     * 也可以不指定镜像，如果不指定镜像，则以当前系统镜像进行安装。
     */
    public String imageId;

    /**
     * IpxeUrl。
     * 传入参数后，imageId不生效。
     */
    public String ipxeUrl;

    /**
     * 实例的主机名。不得超过64个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    @Validation(minLength = 1, maxLength = 64)
    public String hostname;

    /**
     * 实例的密码。必须是 8-16 个字符，包含大写字母、小写字母、数字和特殊字符。特殊符号可以是：
     * `~!@$^*\-_=+|;:,.?
     * 密钥与密码不能同时指定。
     * 密钥与密码必须并且只能指定其中一个。
     */
    @Validation(minLength = 8, maxLength = 16)
    public String password;

    /**
     * 密钥列表。
     * 密钥与密码不能同时指定。
     * 使用了密钥登录，密码登录将会被禁止。
     * 密钥最多支持3个。
     * Windows实例，忽略该参数。默认为空。即使填写了该参数，仍旧只执行password的内容。
     */
    public List<String> sshKeys;

    /**
     * raid配置
     */
    public RaidConfig raidConfig;

    /**
     * 磁盘分区配置
     */
    public List<Partition> partitions;

    /**
     * 网卡名称配置
     */
    public Nic nic;

}
