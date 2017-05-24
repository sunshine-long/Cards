package com.mrkang.since.cards.presenter;

import android.content.Context;

import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.bean.NewMainDataBean;
import com.mrkang.since.cards.contract.MainContract;
import com.mrkang.since.cards.model.MainModel;


/**
 * Created by 康龙 on 2017/5/9.
 */

public class MainPresenter  implements MainContract.Presenter {

    private final MainContract.View mainView;
    private MainModel mainModel;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
        this.mainModel = new MainModel();
        this.mainView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getHomeData(Context context) {
        mainModel.getHomeData(context, new BaseObserver<NewMainDataBean>(context) {
            @Override
            protected void onSuccess(NewMainDataBean mainDataBean) {
                mainView.setHomeData(mainDataBean);
                mainView.initViewPager();
            }
        });
    }


}
