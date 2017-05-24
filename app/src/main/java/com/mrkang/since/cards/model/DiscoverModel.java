package com.mrkang.since.cards.model;

import android.content.Context;

import com.google.gson.Gson;
import com.mrkang.since.cards.base.BaseEntity;
import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.bean.DiscoverDatasBean;
import com.mrkang.since.cards.retrofit.MyRetrofitClient;
import com.mrkang.since.cards.rxandroid.RxSchedulers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by 康龙 on 2017/5/23.
 */

public class DiscoverModel {
    private static final String TAG = MainModel.class.getSimpleName();
    public void getDiscoverDatas(Context context,BaseObserver<DiscoverDatasBean> baseObserver){
        Gson gson = new Gson();
        List<String> bankList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("addressCategoryId", "602");
        map.put("banks", bankList);
        String keyStr = gson.toJson(map);
        Observable<BaseEntity<DiscoverDatasBean>> observable = MyRetrofitClient.getmInstance(context).createService().getDiscoverDatas(keyStr);
        observable.compose(RxSchedulers.<BaseEntity<DiscoverDatasBean>>io_main())
                .subscribe(baseObserver);

    }

    public void getDisCoverShopDatas(Context context,BaseObserver<ContentBean> baseObserver){

    }

}
