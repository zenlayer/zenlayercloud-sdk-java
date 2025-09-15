package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 替换弹性公网IP的请求信息。
 */
public class ReplaceEipAddressRequest extends TeaModel {


    /**
     * 需要替换的弹性公网IP信息
     */
    public List<ReplaceIp> replaceIps;

    public List<ReplaceIp> getReplaceIps() {
        return this.replaceIps;
    }

    public void setReplaceIps(List<ReplaceIp> replaceIps) {
        this.replaceIps = replaceIps;
    }

}