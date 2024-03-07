/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-07-06 23:22:23
 * @version $ Id: AccelerationRuleL7Listener.java, v 0.1  alicat.xu Exp $
 */
public class AccelerationRuleL7Listener extends TeaModel {

    public Integer port;
    public Integer backPort;
    public String  portRange;
    public String  backPortRange;
    @Validation(required = true)
    public String  protocol;
    public String  backProtocol;
    public String  host;

}
