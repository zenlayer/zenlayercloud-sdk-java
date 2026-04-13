package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class AuthorizeSecurityGroupRuleRequest extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 规则方向。
     * ingress：入方向。
     * egress：出方向。
     */
    public String direction;

    /**
     * 设置访问权限。
     * accept（默认值）：接受访问。
     */
    public String policy;

    /**
     * 规则优先级。
     */
    public Integer priority;

    /**
     * 传输层协议。
     * 取值范围：tcp、udp、icmp、all。
     */
    public String ipProtocol;

    /**
     * 目的端安全组开放的传输层协议相关的端口范围。
     */
    public String portRange;

    /**
     * 源端IP地址范围。
     */
    public String cidrIp;

    /**
     * 规则描述。
     */
    public String description;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPolicy() {
        return this.policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public String getPortRange() {
        return this.portRange;
    }

    public void setPortRange(String portRange) {
        this.portRange = portRange;
    }

    public String getCidrIp() {
        return this.cidrIp;
    }

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}