package com.mrkang.since.cards.contract;

import android.content.Context;

import com.mrkang.since.cards.base.BasePresenter;
import com.mrkang.since.cards.base.BaseView;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.bean.DiscoverDatasBean;
import com.mrkang.since.cards.bean.PromotionsBean;

import java.util.List;

/**
 * Created by 康龙 on 2017/5/23.
 */

public interface DiscoverContract {
    interface View extends BaseView<Presenter> {
        void setDisCoverDatas(DiscoverDatasBean datas);
        void initShopListView(List<ContentBean> lists);
        void initViwPager(List<PromotionsBean> mAdsViewList);

    }
    interface Presenter extends BasePresenter{
        void getDisCoverDatas(Context context);
        void getDisCoverShopDatas(Context context);
    }
}
