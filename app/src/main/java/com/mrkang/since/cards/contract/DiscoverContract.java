package com.mrkang.since.cards.contract;

import android.content.Context;

import com.mrkang.since.cards.base.BasePresenter;
import com.mrkang.since.cards.base.BaseView;
import com.mrkang.since.cards.bean.CategoriesBean;
import com.mrkang.since.cards.bean.MainShopListBean;
import com.mrkang.since.cards.bean.PromotionsBean;

import java.util.List;

/**
 * Created by 康龙 on 2017/5/23.
 */

public interface DiscoverContract {
    interface View extends BaseView<Presenter> {
        void initShopListView(MainShopListBean shopListBean);
        void initViwPager(List<PromotionsBean> mAdsViewList);
        void initGridViewPage( List<CategoriesBean> mainTopDatas);
        void loadMoreShop();

    }
    interface Presenter extends BasePresenter{
        void getDisCoverDatas(Context context);
        void getMoreShopDatas(Context context,int page);
    }
}
