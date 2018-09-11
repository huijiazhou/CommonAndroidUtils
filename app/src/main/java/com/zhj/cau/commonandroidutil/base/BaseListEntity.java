package com.zhj.cau.commonandroidutil.base;

import java.util.List;

/**
 * 作者：DWW on 2018/3/21 09:56
 * 团队：Doublez GROUP
 * 邮箱：186386937333@163.com
 * 项目：
 */

public class BaseListEntity<T> {


    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    private String code;

    private String msg;
    private List<T> data;

}
