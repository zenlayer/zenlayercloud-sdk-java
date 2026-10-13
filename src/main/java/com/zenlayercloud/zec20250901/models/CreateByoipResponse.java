package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateByoipResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * RPKI校验失败的BYOIP列表。
     */
    public List<String> rpkiFailedList;

    /**
     * IRR校验失败的BYOIP列表。
     */
    public List<String> irrFailedList;

    /**
     * 创建成功的BYOIP ID列表。
     */
    public List<String> byoipIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getRpkiFailedList() {
        return this.rpkiFailedList;
    }

    public void setRpkiFailedList(List<String> rpkiFailedList) {
        this.rpkiFailedList = rpkiFailedList;
    }

    public List<String> getIrrFailedList() {
        return this.irrFailedList;
    }

    public void setIrrFailedList(List<String> irrFailedList) {
        this.irrFailedList = irrFailedList;
    }

    public List<String> getByoipIds() {
        return this.byoipIds;
    }

    public void setByoipIds(List<String> byoipIds) {
        this.byoipIds = byoipIds;
    }

}