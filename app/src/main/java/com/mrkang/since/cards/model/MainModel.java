package com.mrkang.since.cards.model;

import android.content.Context;

import com.google.gson.Gson;
import com.mrkang.since.cards.base.BaseEntity;
import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.bean.NewMainDataBean;
import com.mrkang.since.cards.retrofit.MyRetrofitClient;
import com.mrkang.since.cards.rxandroid.RxSchedulers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by 康龙 on 2017/5/9.
 */

public class MainModel  {
    private static final String TAG = MainModel.class.getSimpleName();

    public void getHomeData(Context context, BaseObserver<NewMainDataBean> baseObserver){
        List<String> bankList = new ArrayList<>();
        bankList.add("农行");
        bankList.add("建行");
        Map<String, Object> map = new HashMap<>();
        map.put("addressCategoryId", "602");
        map.put("banks", bankList);
        Gson gson = new Gson();
        String keyStr = gson.toJson(map);
        Observable<BaseEntity<NewMainDataBean>> observable = MyRetrofitClient.getmInstance(context).createService().getHomeDatas(keyStr);
        observable.compose(RxSchedulers.<BaseEntity<NewMainDataBean>>io_main())
        .subscribe(baseObserver);
    }

}
