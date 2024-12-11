package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ResetInstancesPasswordRequest extends TeaModel {

    public List<String> instanceIds;

    public String password;
}
