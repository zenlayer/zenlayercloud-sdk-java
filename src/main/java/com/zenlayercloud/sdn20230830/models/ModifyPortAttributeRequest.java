/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:51:46
 * @version $ Id: ModifyPortAttributeRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyPortAttributeRequest extends TeaModel {

    /**
     * 端口id。
     */
    public String portId;

    /**
     * 端口名称。
     */
    public String portName;

    /**
     * 端口备注信息。
     */
    public String portRemarks;

    /**
     * 贵司商业实体名称。
     */
    public String businessEntityName;

}
