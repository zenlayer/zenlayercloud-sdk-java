package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class RegenerateByoAsnVerifyCodeResponse extends TeaModel {


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
     * 重新生成校验码后的状态，回到`VERIFYING`。
     */
    public String status;

    /**
     * 新的校验码。
     * 旧校验码立即失效，需要客户将新校验码写入 RIR 上该ASN的 aut-num 对象。
     */
    public String verifyCode;

    /**
     * 完整的 export 声明语句。
     * 客户直接复制该语句更新 RIR 上该ASN的 aut-num 对象即可。
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