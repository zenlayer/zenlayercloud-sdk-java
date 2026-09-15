package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class VerifyByoAsnResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * BYO ASN 的ID。
     */
    public String byoAsnId;

    /**
     * ASN号。
     */
    public Long asn;

    /**
     * 校验后的状态。
     * `AVAILABLE`表示归属确认通过，该ASN已可用于创建 BYOIP；仍为`VERIFYING`表示尚未检测到 export 声明，可稍后重试。
     */
    public String status;

    /**
     * 校验码。
     * 需要客户将其写入 RIR 上该ASN的 aut-num 对象。
     */
    public String verifyCode;

    /**
     * 完整的 export 声明语句。
     * 客户直接复制该语句写入 RIR 上该ASN的 aut-num 对象即可。
     */
    public String exportDeclaration;

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

}