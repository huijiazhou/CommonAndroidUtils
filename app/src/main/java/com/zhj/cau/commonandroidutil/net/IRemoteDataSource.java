package com.zhj.cau.commonandroidutil.net;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;

import java.util.Map;

import io.reactivex.Flowable;

/**
 * Created by zhj on 2018/9/10.
 */

public interface  IRemoteDataSource<T> {
    //Entity
    Flowable<BaseEntity<T>> getEntity(Map<String, Object> map,Flowable<BaseEntity<T>> baseEntityFlowable );
    //ListEntity
    Flowable<BaseListEntity<T>> getListEntity(Map<String, Object> map,Flowable<BaseListEntity<T>> baseListEntityFlowable );
}
