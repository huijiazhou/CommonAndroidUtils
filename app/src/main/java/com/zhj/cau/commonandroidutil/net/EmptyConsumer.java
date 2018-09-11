package com.zhj.cau.commonandroidutil.net;

import android.util.Log;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Copyright ©2017 by ruzhan
 */

public class EmptyConsumer implements Consumer<Object> {

    @Override
    public void accept(@NonNull Object object) throws Exception {
        Log.i("object",object.toString());
    }
}
