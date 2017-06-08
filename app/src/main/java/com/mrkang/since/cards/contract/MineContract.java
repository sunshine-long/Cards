package com.mrkang.since.cards.contract;

import com.mrkang.since.cards.base.BasePresenter;
import com.mrkang.since.cards.base.BaseView;

/**
 * Created by 康龙 on 2017/6/5.
 */

public interface MineContract {

    interface View extends BaseView<Presenter>{
        void avaterHead();
    }

    interface Presenter extends BasePresenter{
        void loadUpHead(String content);
    }

}
