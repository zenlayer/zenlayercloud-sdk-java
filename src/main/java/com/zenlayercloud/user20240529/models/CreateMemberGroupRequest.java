package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateMemberGroupRequest extends TeaModel {


    /**
     * 成员组名称。
     */
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}