package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 删除一个或多个密钥对的响应结果。
 */
public class DeleteKeyPairsRequest extends TeaModel {


    /**
     * 一个或多个待操作的密钥对ID。
     * 每次请求批量密钥对的上限为100
     */
    public List<String> keyIds;

    public List<String> getKeyIds() {
        return this.keyIds;
    }

    public void setKeyIds(List<String> keyIds) {
        this.keyIds = keyIds;
    }

}