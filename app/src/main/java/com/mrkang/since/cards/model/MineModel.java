package com.mrkang.since.cards.model;

import android.content.Context;

import com.google.gson.Gson;
import com.mrkang.since.cards.base.BaseEntity;
import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.retrofit.MyRetrofitClient;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by 康龙 on 2017/6/7.
 */

public class MineModel {
    private static final String TAG = MineModel.class.getSimpleName();
    public void loadUpHead(Context context, String fileString, BaseObserver<String> baseObserver){
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<>();
        map.put("fileType", "portrait");
        map.put("content", fileString);
        map.put("extension", "png");
        String mapStr = gson.toJson(map);
        Observable<BaseEntity<String>> observable = MyRetrofitClient.getmInstance(context).createService().upLoadPortrait(mapStr);
    }
}
