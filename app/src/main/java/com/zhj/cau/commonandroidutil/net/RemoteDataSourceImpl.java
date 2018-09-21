package com.zhj.cau.commonandroidutil.net;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;

import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * Created by zhj on 2018/9/10.
 */

public class RemoteDataSourceImpl<T> implements IRemoteDataSource {


    public RemoteDataSourceImpl() {

    }


    @Override
    public Flowable<T> getEntity(Map map, Flowable flowable) {
        return flowable.subscribeOn(Schedulers.io());
    }

}
