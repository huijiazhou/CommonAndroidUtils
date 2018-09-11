package com.zhj.cau.commonandroidutil.net;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;

import java.util.Map;

import io.reactivex.Flowable;

/**
 * Created by zhj on 2018/9/10.
 */

public final class RetrofitRepository<T> implements IRemoteDataSource{
    private static RetrofitRepository INSTANCE;

    private IRemoteDataSource remoteDataSource;

    private RetrofitRepository() {
        remoteDataSource = new RemoteDataSourceImpl();
    }

    public static RetrofitRepository get() {
        if (INSTANCE == null) {
            synchronized (RetrofitRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RetrofitRepository();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Flowable<BaseEntity<T>> getEntity(Map map, Flowable flowable) {
        return remoteDataSource.getEntity(map,flowable);
    }

    @Override
    public Flowable<BaseListEntity<T>> getListEntity(Map map, Flowable flowable) {
        return remoteDataSource.getListEntity(map,flowable);
    }
}
