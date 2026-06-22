/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2025 All Rights Reserved.
 */
package com.zenlayercloud.common;

/**
 * Backoff strategy for rate-limit retries. Given the zero-based retry index,
 * returns the wait time in seconds before the next retry.
 */
public interface RetryDurationFunction {
    int getDurationSeconds(int retryIndex);
}
