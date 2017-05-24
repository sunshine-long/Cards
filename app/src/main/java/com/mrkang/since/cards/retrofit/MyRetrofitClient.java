package com.mrkang.since.cards.retrofit;

import android.content.Context;

import com.mrkang.since.cards.constant.AppConst;
import com.mrkang.since.cards.service.RetrofitService;
import com.mrkang.since.cards.utils.LogUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 康龙 on 2017/5/8.
 */

public class MyRetrofitClient {
    private static final long TIMEOUT = 30;
    private static final String TAG = "MyRetrofitClient";
    private static MyRetrofitClient mInstance;
    private Retrofit retrofit;

    public static MyRetrofitClient getmInstance(Context context) {
        if (mInstance == null) {
            mInstance = new MyRetrofitClient(context);
        }
        return mInstance;
    }

    public MyRetrofitClient(Context context) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cookieJar(new CookieManger(context))
                .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(String message) {
                        LogUtils.d(TAG, message);
                    }
                }).setLevel(HttpLoggingInterceptor.Level.BASIC))
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(AppConst.BaseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public RetrofitService createService() {
        return retrofit.create(RetrofitService.class);
    }
}
