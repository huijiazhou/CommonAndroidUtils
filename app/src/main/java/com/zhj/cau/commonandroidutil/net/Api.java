package com.zhj.cau.commonandroidutil.net;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;
import com.zhj.cau.commonandroidutil.bean.AdBean;

import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zhj on 2018/9/10.
 */

public interface Api {

    @FormUrlEncoded
    @POST(NetUrl.findAds)
    Flowable<BaseEntity<AdBean>> getAdData(@FieldMap Map<String,Object> map);

}
