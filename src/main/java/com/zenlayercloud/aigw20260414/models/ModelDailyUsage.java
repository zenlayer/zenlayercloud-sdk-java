package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;


/**
 * 模型日用量。
 */
public class ModelDailyUsage extends TeaModel {


    /**
     * 模型名称。
     */
    public String modelName;

    /**
     * 未命中缓存的输入Token数。
     */
    public Long promptMissedTokens;

    /**
     * 输出Token数。
     */
    public Long completionTokens;

    /**
     * 命中缓存的Token数。
     */
    public Long cachedTokens;

    /**
     * 缓存创建Token数（Anthropic模型）。
     */
    public Long cacheCreationInputTokens;

    /**
     * 推理Token数。
     */
    public Long reasoningTokens;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getPromptMissedTokens() {
        return this.promptMissedTokens;
    }

    public void setPromptMissedTokens(Long promptMissedTokens) {
        this.promptMissedTokens = promptMissedTokens;
    }

    public Long getCompletionTokens() {
        return this.completionTokens;
    }

    public void setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Long getCachedTokens() {
        return this.cachedTokens;
    }

    public void setCachedTokens(Long cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    public Long getCacheCreationInputTokens() {
        return this.cacheCreationInputTokens;
    }

    public void setCacheCreationInputTokens(Long cacheCreationInputTokens) {
        this.cacheCreationInputTokens = cacheCreationInputTokens;
    }

    public Long getReasoningTokens() {
        return this.reasoningTokens;
    }

    public void setReasoningTokens(Long reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
    }

}