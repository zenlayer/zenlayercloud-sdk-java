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
public class RaidConfig extends TeaModel {

    /**
     * raid类型，可选项：0、1、5、10
     */
    public Integer raidType;

    /**
     * 自定义raid
     */
    public List<CustomRaid> customRaids;

    public static class CustomRaid extends TeaModel {

        /**
         * raid类型，可选项：0、1、5、10
         */
        @Validation(required = true)
        public Integer raidType;

        /**
         * 组成raid的磁盘序号
         */
        @Validation(required = true, minLength = 1)
        public List<Integer> diskSequence;

    }
}
