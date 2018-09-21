package com.zhj.cau.commonandroidutil.net;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;

import java.util.Map;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;

/**
 * Created by zhj on 2018/9/10.
 */

public interface  IRemoteDataSource<T> {
    //Entity
    Flowable<T> getEntity(Map<String, Object> map,Flowable<T> baseEntityFlowable );
}
