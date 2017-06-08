package com.mrkang.since.cards.presenter;

import android.content.Context;

import com.mrkang.since.cards.base.BaseObserver;
import com.mrkang.since.cards.contract.MineContract;
import com.mrkang.since.cards.model.MineModel;
import com.mrkang.since.cards.utils.LogUtils;

/**
 * Created by 康龙 on 2017/6/5.
 */

public class MinePresenter implements MineContract.Presenter{
    private static final String TAG = MinePresenter.class.getSimpleName();
    private MineContract.View mineView;
    private MineModel mineModel;
    private Context mContext;


    public MinePresenter(Context context,MineContract.View mineView) {
        this.mineView = mineView;
        this.mContext = context;
        this.mineModel = new MineModel();
        mineView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void loadUpHead(String content) {
        mineModel.loadUpHead(mContext, content, new BaseObserver<String>(mContext) {
            @Override
            protected void onSuccess(String responseBody) {
                    String S = responseBody;
                    LogUtils.d(TAG,S);

            }
        });
    }
}
