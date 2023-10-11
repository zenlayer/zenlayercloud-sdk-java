/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

import com.aliyun.tea.Tea;
import com.aliyun.tea.TeaConverter;
import com.aliyun.tea.TeaModel;
import com.aliyun.tea.TeaPair;
import com.aliyun.tea.TeaRequest;
import com.aliyun.tea.TeaResponse;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;

import java.util.Map;

/**
 * @author wolfgang
 * @date 2022-11-09 20:17:45
 * @version $ Id: AbstractClient.java, v 0.1  wolfgang Exp $
 */
public class AbstractClient {
    private final       InterceptorChain interceptorChain = InterceptorChain.create();
    public static final String           SDK_VERSION      = "0.6.7";

    private final Credential _credential;
    private final String     _endpoint;
    private final String     _protocol;
    private final String     _method;
    private final String     _userAgent;
    private final Integer    _readTimeout;
    private final Integer    _connectTimeout;
    private final String     _httpProxy;
    private final String     _httpsProxy;
    private final String     _noProxy;
    private final String     _socks5Proxy;
    private final String     _socks5NetWork;
    private final Integer    _maxIdleConns;
    private final String     _signatureVersion;
    private final String     _signatureAlgorithm;
    private final String     _service;
    private final String     _apiVersion;
    private final String     _path;

    public AbstractClient(Credential credential, Config config, String endpoint, String apiVersion, String path) {
        this._credential = credential;
        this._protocol = config.protocol;
        this._method = config.method;
        this._userAgent = config.userAgent;
        this._readTimeout = config.readTimeout;
        this._connectTimeout = config.connectTimeout;
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = config.maxIdleConns;
        this._signatureVersion = config.signatureVersion;
        this._signatureAlgorithm = config.signatureAlgorithm;
        this._endpoint = endpoint;
        this._apiVersion = apiVersion;
        this._service = path.replace("/api/v2/", "");
        this._path = path;

    }

    protected java.util.Map<String, ?> callApi(TeaModel request, String actionName, RuntimeOptions runtime) {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request))) {
            throw new ZenlayerSdkException("'request' can not be unset");
        }
        validateParams(request);
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(new TeaPair("timeouted", "retry"),
                new TeaPair("readTimeout", Common.defaultNumber(runtime.readTimeout, _readTimeout)),
                new TeaPair("connectTimeout", Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
                new TeaPair("httpProxy", Common.defaultString(runtime.httpProxy, _httpProxy)),
                new TeaPair("httpsProxy", Common.defaultString(runtime.httpsProxy, _httpsProxy)),
                new TeaPair("noProxy", Common.defaultString(runtime.noProxy, _noProxy)),
                new TeaPair("socks5Proxy", Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
                new TeaPair("socks5NetWork", Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
                new TeaPair("maxIdleConns", Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)), new TeaPair("retry",
                        TeaConverter.buildMap(new TeaPair("retryable", runtime.autoretry),
                                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3)))),
                new TeaPair("backoff", TeaConverter.buildMap(new TeaPair("policy", Common.defaultString(runtime.backoffPolicy, "no")),
                        new TeaPair("period", Common.defaultNumber(runtime.backoffPeriod, 1)))),
                new TeaPair("ignoreSSL", runtime.ignoreSSL));

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        TeaResponse _lastResponse = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = _protocol;
                request_.method = _method;
                request_.pathname = _path;

                request_.headers = TeaConverter.buildMap(new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                        new TeaPair("host", _endpoint), new TeaPair("accept", "application/json"),
                        new TeaPair("x-zc-signature-method", _signatureAlgorithm), new TeaPair("x-zc-signature-version", _signatureVersion),
                        new TeaPair("x-zc-version", _apiVersion), new TeaPair("x-zc-action", actionName),
                        new TeaPair("x-zc-service", _service), new TeaPair("x-zc-sdk-lang", "java"),
                        new TeaPair("x-zc-sdk-version", SDK_VERSION),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent)));

                Map<String, Object> param = request.toMap();
                String bodyString = Common.toJSONString(param);
                request_.body = Tea.toReadable(bodyString);
                request_.headers.put("content-type", "application/json; charset=utf-8");

                // build authorization header

                String authorization = ApiUtil.getAuthorization(request_, _endpoint, _signatureAlgorithm, bodyString,
                        _credential.getAccessKeyId(), _credential.getAccessKeyPassword());

                request_.headers.put("Authorization", authorization);

                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);
                _lastResponse = response_;

                if (com.aliyun.teautil.Common.equalNumber(response_.statusCode, 204)) {
                    return TeaConverter.buildMap(new TeaPair("headers", response_.headers));
                }

                if (Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    Object _res = Common.readAsJSON(response_.body);
                    java.util.Map<String, Object> err = Common.assertAsMap(_res);
                    Object errorCode = err.get("code");
                    Object requestId = err.get("requestId");
                    throw new ZenlayerSdkException(requestId + "",
                            "HTTP Status: " + response_.statusCode + ", ErrorCode: " + errorCode + ", Message: " + err.get("message")
                                    + ", RequestId: " + requestId, errorCode + "");
                }

                Object obj = com.aliyun.teautil.Common.readAsJSON(response_.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                return (Map<String, ?>) res.get("response");

            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw new ZenlayerSdkException(e);
            } finally {
                if (!Common.isUnset(_lastResponse) && !Common.isUnset(_lastResponse.response) && !Common.isUnset(
                        _lastResponse.response.body())) {
                    _lastResponse.response.close();
                }
            }
        }
        throw new ZenlayerSdkException("request is unreachable", _lastException);

    }

    private void validateParams(TeaModel request) {
        try {
            request.validate();
        } catch (Exception e) {
            throw new ZenlayerSdkException("Parameter illegal", e);
        }
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

}
