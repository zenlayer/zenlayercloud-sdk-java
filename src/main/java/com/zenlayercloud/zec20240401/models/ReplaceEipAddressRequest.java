package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class ReplaceEipAddressRequest extends TeaModel {
    @Validation(required = true)
    public List<ReplaceIp> replaceIps;

    public static class ReplaceIp extends TeaModel {
        @Validation(required = true)
        public String eipId;

        public String ownIp;

        @Validation(required = true)
        public String targetIp;
    }
}
