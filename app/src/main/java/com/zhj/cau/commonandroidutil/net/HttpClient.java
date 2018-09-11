package com.zhj.cau.commonandroidutil.net;

import java.util.Arrays;

import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by zhj on 2018/9/10.
 */

public class HttpClient {

    private static HttpClient httpClient;

    private OkHttpClient okHttpClient;

    public static HttpClient get() {
        if (httpClient == null) {
            synchronized (HttpClient.class) {
                if (httpClient == null) {
                    httpClient = new HttpClient();
                }
            }
        }
        return httpClient;
    }

    private HttpClient() {
        //声明日志类
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//设定日志级别
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


//自定义OkHttpClient
        OkHttpClient.Builder okHttpClient2 = new OkHttpClient.Builder();
//添加拦截器
        okHttpClient2.addInterceptor(httpLoggingInterceptor);
        ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                .tlsVersions(TlsVersion.TLS_1_2)
                .cipherSuites(
                        CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
                        CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
                        CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256)
                .build();
        okHttpClient2.connectionSpecs(Arrays.asList(ConnectionSpec.CLEARTEXT,spec, ConnectionSpec.COMPATIBLE_TLS));

        okHttpClient2.sslSocketFactory(SSLSocketFactoryUtils.createSSLSocketFactory(), SSLSocketFactoryUtils.createTrustAllManager());
        okHttpClient2.hostnameVerifier(new SSLSocketFactoryUtils.TrustAllHostnameVerifier());
        // 超时时间

        // 错误重连
        okHttpClient2.retryOnConnectionFailure(true);


        okHttpClient = okHttpClient2.build();


    }

    public static OkHttpClient getHttpClient() {
        return get().okHttpClient;
    }
}

