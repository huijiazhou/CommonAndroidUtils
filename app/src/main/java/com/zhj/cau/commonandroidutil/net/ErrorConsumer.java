package com.zhj.cau.commonandroidutil.net;

import android.util.Log;


import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * Copyright ©2017 by ruzhan
 */

public class ErrorConsumer implements Consumer<Throwable> {

    @Override
    public void accept(@NonNull Throwable throwable) throws Exception {
        Log.e("TAG",throwable.toString());
    }
}
