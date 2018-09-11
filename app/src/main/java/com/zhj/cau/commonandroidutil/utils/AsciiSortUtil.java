package com.zhj.cau.commonandroidutil.utils;

import com.zhj.cau.commonandroidutil.net.NetUrl;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhou on 2018/4/10.ascll排序
 */

public class AsciiSortUtil {
    public static String buildSign(Map<String, Object> map) {
        Set<Map.Entry<String, Object>> set = map.entrySet();
        StringBuffer sb = new StringBuffer();
        //取出排序后的参数，逐一连接起来
        for (Iterator<Map.Entry<String, Object>> it = set.iterator(); it.hasNext();) {
            Map.Entry<String, Object> me = it.next();
            sb.append(me.getKey()+"="+me.getValue() );
            if (it.hasNext()){
                sb.append("&");
            }
        }
        sb.append(NetUrl.key);


//        return sb.toString().toUpperCase();//返回最终排序后的结果，这里key不参与排序中，具体看接口规约
        return MdfiveEncryptUtils.getMD5Str(sb.toString());
    }
}
