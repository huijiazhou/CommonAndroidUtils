package com.zhj.cau.commonandroidutil.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhj on 2018/9/10.
 */

public final class NetClient {
    private static final String HOST = "https://api.caipiaoq.com/";//测试
    private static Api api;

    private NetClient() {
    }

    public static Api get() {
        if (api == null) {
            synchronized (NetClient.class) {
                if (api == null) {

                    Retrofit client = new Retrofit.Builder().baseUrl(HOST)
                            .client(HttpClient.getHttpClient())
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                    api = client.create(Api.class);
                }
            }
        }
        return api;
    }
}
