package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateByoAsnResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 新建BYO ASN的ID。
     */
    public String byoAsnId;

    /**
     * ASN号。
     */
    public Long asn;

    /**
     * 当前状态。
     */
    public String status;

    /**
     * 校验码。
     * 需要客户将其写入RIR上该ASN的aut-num对象。
     */
    public String verifyCode;

    /**
     * 完整的export声明语句。
     * 客户直接复制该语句写入RIR上该ASN的aut-num对象即可。
     */
    public String exportDeclaration;

    /**
     * 创建时间。
     */
    public String createTime;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getByoAsnId() {
        return this.byoAsnId;
    }

    public void setByoAsnId(String byoAsnId) {
        this.byoAsnId = byoAsnId;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getExportDeclaration() {
        return this.exportDeclaration;
    }

    public void setExportDeclaration(String exportDeclaration) {
        this.exportDeclaration = exportDeclaration;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}