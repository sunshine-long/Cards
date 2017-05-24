package com.mrkang.since.cards.contract;

import android.content.Context;

import com.mrkang.since.cards.base.BasePresenter;
import com.mrkang.since.cards.base.BaseView;
import com.mrkang.since.cards.bean.NewMainDataBean;

/**
 * Created by 康龙 on 2017/5/9.
 */

public interface MainContract {
     interface View extends BaseView<Presenter>{
        void initViewPager();
        void initRecyclerView();
         void setHomeData(NewMainDataBean mainDataBean);
    }

     interface Presenter extends BasePresenter{
        void getHomeData(Context context);
    }
}
