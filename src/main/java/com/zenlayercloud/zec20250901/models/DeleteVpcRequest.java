package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除VPC的响应信息。
 */
public class DeleteVpcRequest extends TeaModel {


    /**
     * 要删除的VPC ID
     */
    public String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

}