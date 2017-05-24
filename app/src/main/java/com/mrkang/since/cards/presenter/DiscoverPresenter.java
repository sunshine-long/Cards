package com.mrkang.since.cards.presenter;

import android.content.Context;

import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.bean.DiscoverDatasBean;
import com.mrkang.since.cards.contract.DiscoverContract;
import com.mrkang.since.cards.model.DiscoverModel;

/**
 * Created by 康龙 on 2017/5/23.
 */

public class DiscoverPresenter implements DiscoverContract.Presenter {

    private final DiscoverContract.View discoverView;
    private final DiscoverModel discoverModel;

    public DiscoverPresenter(DiscoverContract.View discoverView, DiscoverModel discoverModel) {
        this.discoverView = discoverView;
        this.discoverModel = discoverModel;
        discoverView.setPresenter(this);
    }

    @Override
    public void getDisCoverDatas(Context context) {
        discoverModel.getDiscoverDatas(context, new BaseObserver<DiscoverDatasBean>(context) {
            @Override
            protected void onSuccess(DiscoverDatasBean discoverDatasBean) {
                discoverView.setDisCoverDatas(discoverDatasBean);
                discoverView.initViwPager(discoverDatasBean.getPromotions());
            }
        });

    }

    @Override
    public void start() {

    }
}
