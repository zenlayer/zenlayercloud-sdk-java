/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.common;

import com.aliyun.tea.Tea;
import com.aliyun.tea.TeaConverter;
import com.aliyun.tea.TeaException;
import com.aliyun.tea.TeaModel;
import com.aliyun.tea.TeaPair;
import com.aliyun.tea.TeaRequest;
import com.aliyun.tea.TeaResponse;
import com.aliyun.tea.TeaUnretryableException;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.teaopenapi.Client;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.zenlayercloud.common.ApiUtil.getCanonicalQueryString;

/**
 * @author wolfgang
 * @date 2022-11-09 20:17:45
 * @version $ Id: AbstractClient.java, v 0.1  wolfgang Exp $
 */
public class AbstractClient {
    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    private Credential _credential;
    private String _endpoint;
    private String _protocol;
    private String _method;
    private String _userAgent;
    private Integer _readTimeout;
    private Integer _connectTimeout;
    private String _httpProxy;
    private String _httpsProxy;
    private String _noProxy;
    private String _socks5Proxy;
    private String _socks5NetWork;
    private Integer _maxIdleConns;
    private String _signatureVersion;
    private String _signatureAlgorithm;
    private String _service;
    private String _apiVersion;
    private String _path;

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
        this._service = path.replace("/api/","");
        this._path = path;

    }

    protected java.util.Map<String, ?> callApi(TeaModel request, String actionName, RuntimeOptions runtime) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request))) {
            throw new TeaException(TeaConverter.buildMap(
                    new TeaPair("code", "ParameterMissing"),
                    new TeaPair("message", "'request' can not be unset")
            ));
        }
        TeaModel.validateParams(request, "request");
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
                new TeaPair("timeouted", "retry"),
                new TeaPair("readTimeout", Common.defaultNumber(runtime.readTimeout, _readTimeout)),
                new TeaPair("connectTimeout", Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
                new TeaPair("httpProxy", Common.defaultString(runtime.httpProxy, _httpProxy)),
                new TeaPair("httpsProxy", Common.defaultString(runtime.httpsProxy, _httpsProxy)),
                new TeaPair("noProxy", Common.defaultString(runtime.noProxy, _noProxy)),
                new TeaPair("socks5Proxy", Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
                new TeaPair("socks5NetWork", Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
                new TeaPair("maxIdleConns", Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
                new TeaPair("retry", TeaConverter.buildMap(
                        new TeaPair("retryable", runtime.autoretry),
                        new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
                )),
                new TeaPair("backoff", TeaConverter.buildMap(
                        new TeaPair("policy", Common.defaultString(runtime.backoffPolicy, "no")),
                        new TeaPair("period", Common.defaultNumber(runtime.backoffPeriod, 1))
                )),
                new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

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

                request_.headers = TeaConverter.buildMap(
                        new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                        new TeaPair("host", _endpoint),
                        new TeaPair("accept", "application/json"),
                        new TeaPair("x-zc-signature-method", _signatureAlgorithm),
                        new TeaPair("x-zc-signature-version", _signatureVersion),
                        new TeaPair("x-zc-version", _apiVersion),
                        new TeaPair("x-zc-action", actionName),
                        new TeaPair("x-zc-service", _service),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                );

                Map<String, Object> param = request.toMap();
                String bodyString = Common.toJSONString(param);
                request_.body = Tea.toReadable(bodyString);
                request_.headers.put("content-type", "application/json; charset=utf-8");

                // build authorization header

                String authorization = ApiUtil.getAuthorization(request_, _endpoint,_signatureAlgorithm,bodyString, _credential.getAccessKeyId(), _credential.getAccessKeyPassword());

                request_.headers.put("Authorization", authorization);

                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);
                _lastResponse = response_;

                if (com.aliyun.teautil.Common.equalNumber(response_.statusCode, 204)) {
                    return TeaConverter.buildMap(
                            new TeaPair("headers", response_.headers)
                    );
                }

                if (Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    Object _res = Common.readAsJSON(response_.body);
                    java.util.Map<String, Object> err = Common.assertAsMap(_res);
                    Object requestId = Client.defaultAny(err.get("RequestId"), err.get("requestId"));
                    requestId = Client.defaultAny(requestId, err.get("requestid"));
                    throw new TeaException(TeaConverter.buildMap(
                            new TeaPair("code", "" + Client.defaultAny(err.get("Code"), err.get("code")) + ""),
                            new TeaPair("message", "code: " + response_.statusCode + ", " + Client.defaultAny(err.get("Message"), err.get("message")) + " request id: " + requestId + ""),
                            new TeaPair("data", err)
                    ));
                }

                Object obj = com.aliyun.teautil.Common.readAsJSON(response_.body);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                return TeaConverter.buildMap(
                        new TeaPair("body", res),
                        new TeaPair("headers", response_.headers)
                );

            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            } finally {
                if (!Common.isUnset(_lastResponse)
                        && !Common.isUnset(_lastResponse.response)
                        && !Common.isUnset(_lastResponse.response.body())){
                    _lastResponse.response.close();
                }
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);

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
