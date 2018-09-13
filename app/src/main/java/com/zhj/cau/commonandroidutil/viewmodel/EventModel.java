package com.zhj.cau.commonandroidutil.viewmodel;

import com.zhj.cau.commonandroidutil.base.BaseEntity;
import com.zhj.cau.commonandroidutil.base.BaseListEntity;
import com.zhj.cau.commonandroidutil.bean.AdBean;
import com.zhj.cau.commonandroidutil.bean.EventLogo;
import com.zhj.cau.commonandroidutil.net.EmptyConsumer;
import com.zhj.cau.commonandroidutil.net.ErrorConsumer;
import com.zhj.cau.commonandroidutil.net.NetClient;
import com.zhj.cau.commonandroidutil.net.RetrofitRepository;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by zhj on 2018/9/10.
 */

public class EventModel {

    public EventModel(){

    }

    public void getEventLogo(Map<String,Object> map){
        RetrofitRepository.get().getListEntity(map, NetClient.get().getEventFilterLogo(map))
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError(throwable ->
                        setError(throwable))
                .doOnNext(httpresult ->
                        setResult(httpresult))
                .subscribe(new EmptyConsumer(),new ErrorConsumer());
    }

    private void setError(Object throwable) {

    }

    private void setResult(Object httpresult) {
        BaseListEntity<EventLogo> adBean = (BaseListEntity<EventLogo>) httpresult;
    }



}
