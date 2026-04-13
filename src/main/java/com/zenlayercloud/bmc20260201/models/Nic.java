package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡的相关配置，目前包括公网和内网的网卡名称。
 */
public class Nic extends TeaModel {


    /**
     * 公网网卡名称。
     * 只能是数字和大小写字母，且必须以字母开头，长度限制为4-10。
     * 非高可用机型，默认的公网网卡名称为wan0。且不能为lan开头。
     * 高可用机型，默认的公网网卡名称为bond0。
     * 公网名称和内网名称不能相同。
     */
    public String wanName;

    /**
     * 内网网卡名称。
     * 只能是数字和大小写字母，且必须以字母开头，长度限制为4-10。
     * 非高可用机型，默认的内网网卡名称为lan0。且不能为wan开头。
     * 高可用机型，默认的内网网卡名称为bond1。
     * 公网名称和内网名称不能相同。
     */
    public String lanName;

    public String getWanName() {
        return this.wanName;
    }

    public void setWanName(String wanName) {
        this.wanName = wanName;
    }

    public String getLanName() {
        return this.lanName;
    }

    public void setLanName(String lanName) {
        this.lanName = lanName;
    }

}