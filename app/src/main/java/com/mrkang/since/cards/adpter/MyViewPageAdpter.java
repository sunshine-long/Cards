package com.mrkang.since.cards.adpter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 康龙 on 2017/5/8.
 */

public class MyViewPageAdpter extends PagerAdapter {
    private List<View> mViewList;

    public MyViewPageAdpter(List<View> list){
        this.mViewList = list;
    }
    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewList.get(position));

    }
}
