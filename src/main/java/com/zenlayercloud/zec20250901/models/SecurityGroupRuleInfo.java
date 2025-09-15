package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 安全组规则信息。包括出入方向、端口范围、IP协议等信息。
 */
public class SecurityGroupRuleInfo extends TeaModel {


    /**
     * 规则方向。
     * ingress: 入方向。
     * egress：出方向
     */
    public String direction;

    /**
     * 设置访问权限。
     * accept：接受访问。
     * deny: 拒绝访问
     */
    public String policy;

    /**
     * 规则优先级
     */
    public Integer priority;

    /**
     * 传输层协议。
     * 取值大小写敏感, 取值范围：<br/>tcp：TCP协议。
     * udp：UDP协议。
     * icmp：ICMP协议。
     * all：支持所有协议
     */
    public String ipProtocol;

    /**
     * 目的端安全组开放的传输层协议相关的端口范围。
     * 取值范围：<br/> TCP/UDP协议：取值范围为1~65535。
     * ICMP协议：-1。
     * all：-1
     */
    public String portRange;

    /**
     * 源端IP地址范围。
     * 支持CIDR格式和IPv4格式的IP地址范围。
     * 默认值：0.0.XX.XX/0
     */
    public String cidrIp;

    /**
     * 备注,长度在255个以内
     */
    public String desc;

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

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}