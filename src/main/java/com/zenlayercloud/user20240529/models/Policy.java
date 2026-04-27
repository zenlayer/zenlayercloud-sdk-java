package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述访问策略的响应信息。包括ID，名称，描述等。
 */
public class Policy extends TeaModel {


    /**
     * 访问策略唯一ID。
     */
    public String policyId;

    /**
     * 权访问策略是否为全部资源组(1:是；0否)。
     */
    public Integer allResource;

    /**
     * 访问策略显示名称。
     */
    public String name;

    /**
     * 访问策略描述信息。
     */
    public String desc;

    /**
     * 访问策略授权次数。
     */
    public Integer authorizationTime;

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Integer getAllResource() {
        return this.allResource;
    }

    public void setAllResource(Integer allResource) {
        this.allResource = allResource;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getAuthorizationTime() {
        return this.authorizationTime;
    }

    public void setAuthorizationTime(Integer authorizationTime) {
        this.authorizationTime = authorizationTime;
    }

}