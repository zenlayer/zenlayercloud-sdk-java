package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * ASN 观测详情。
 */
public class AsnObservationDetail extends TeaModel {


    /**
     * ASN 验证状态。
     */
    public String verificationStatus;

    /**
     * 观测网段。
     */
    public String observedPrefix;

    /**
     * 主数据源名称，如 RIPE。
     */
    public String primarySource;

    /**
     * 主数据源查询状态。
     */
    public String primaryStatus;

    /**
     * 主数据源观测到的 ASN 列表。
     */
    public List<Integer> primaryAsns;

    /**
     * 二级数据源名称，如 BGP Tool。
     */
    public String secondarySource;

    /**
     * 二级数据源查询状态。
     */
    public String secondaryStatus;

    /**
     * 二级数据源观测到的 ASN 列表。
     */
    public List<Integer> secondaryAsns;

    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getObservedPrefix() {
        return this.observedPrefix;
    }

    public void setObservedPrefix(String observedPrefix) {
        this.observedPrefix = observedPrefix;
    }

    public String getPrimarySource() {
        return this.primarySource;
    }

    public void setPrimarySource(String primarySource) {
        this.primarySource = primarySource;
    }

    public String getPrimaryStatus() {
        return this.primaryStatus;
    }

    public void setPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
    }

    public List<Integer> getPrimaryAsns() {
        return this.primaryAsns;
    }

    public void setPrimaryAsns(List<Integer> primaryAsns) {
        this.primaryAsns = primaryAsns;
    }

    public String getSecondarySource() {
        return this.secondarySource;
    }

    public void setSecondarySource(String secondarySource) {
        this.secondarySource = secondarySource;
    }

    public String getSecondaryStatus() {
        return this.secondaryStatus;
    }

    public void setSecondaryStatus(String secondaryStatus) {
        this.secondaryStatus = secondaryStatus;
    }

    public List<Integer> getSecondaryAsns() {
        return this.secondaryAsns;
    }

    public void setSecondaryAsns(List<Integer> secondaryAsns) {
        this.secondaryAsns = secondaryAsns;
    }

}