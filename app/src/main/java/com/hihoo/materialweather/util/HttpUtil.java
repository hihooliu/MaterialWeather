package com.hihoo.materialweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Liuhx on 2016/12/13.
 */

public class HttpUtil {

    //通用Http请求方法
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
