package com.mrkang.since.cards.service;

import com.mrkang.since.cards.base.BaseEntity;
import com.mrkang.since.cards.bean.DiscoverDatasBean;
import com.mrkang.since.cards.bean.MainShopListBean;
import com.mrkang.since.cards.bean.NewMainDataBean;
import com.mrkang.since.cards.constant.ApiInterface;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by 康龙 on 2017/5/9.
 */

public interface RetrofitService {

        @GET(ApiInterface.MAIN_HOME_INDEX) //这里的{id} 表示是一个变量
        Observable<BaseEntity<NewMainDataBean>> getHomeDatas(@Query("json") String map);
        /**
         * 获取发现数据
         */
        @GET(ApiInterface.DISCOVER_INDEX) //这里的{id} 表示是一个变量
        Observable<BaseEntity<DiscoverDatasBean>> getDiscoverDatas(@Query("json") String map);

        @GET(ApiInterface.SHOP_LIST)
        Observable<BaseEntity<MainShopListBean>> getShopList(@Query("json") String map);


        /**
         * 上传头像
         */
        @POST(ApiInterface.PROFILE_PROTRAIT)
        @FormUrlEncoded
        Observable<BaseEntity<String>> upLoadPortrait(@Field("json") String map);

}
