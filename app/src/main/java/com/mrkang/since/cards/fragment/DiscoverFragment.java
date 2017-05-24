package com.mrkang.since.cards.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.adpter.DiscoverBankListAdpter;
import com.mrkang.since.cards.adpter.MyViewPageAdpter;
import com.mrkang.since.cards.base.BaseFragment;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.bean.DiscoverDatasBean;
import com.mrkang.since.cards.bean.PromotionsBean;
import com.mrkang.since.cards.contract.DiscoverContract;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.mrkang.since.cards.widget.WrapContentHeightViewPager;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends BaseFragment implements DiscoverContract.View{


    @BindView(R.id.search_search_tv)
    EditText searchSearchTv;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.pointgroup)
    LinearLayout pointgroup;
    @BindView(R.id.vp)
    WrapContentHeightViewPager vp;
    @BindView(R.id.pointgroup2)
    LinearLayout pointgroup2;
    @BindView(R.id.main_playbigiv)
    ImageView mainPlaybigiv;
    @BindView(R.id.listview)
    RecyclerView listview;
    @BindView(R.id.mScrollView)
    ScrollView mScrollView;
    Unbinder unbinder;

    private DiscoverContract.Presenter mPresenter;
    ImageLoader imageLoader = ImageLoader.getInstance();
    private MyViewPageAdpter pageAdpter;
    private List<View> imageViews = new ArrayList<>();
    Handler mHandler = new Handler();
    private DiscoverBankListAdpter listAdpter;
    private LinearLayoutManager linearLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_discover, null);
        unbinder = ButterKnife.bind(this, view);
        mPresenter.getDisCoverDatas(getContext());
        initHandler();
        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void setPresenter(DiscoverContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setDisCoverDatas(DiscoverDatasBean datas) {

    }

    @Override
    public void initShopListView(List<ContentBean> lists) {
        listAdpter = new DiscoverBankListAdpter(getContext(),lists);
        linearLayoutManager = new LinearLayoutManager(getContext());
        listview.setLayoutManager(linearLayoutManager);
        listview.setAdapter(listAdpter);
        listview.setNestedScrollingEnabled(false);
        listview.setHasFixedSize(true);
    }

    @Override
    public void initViwPager(List<PromotionsBean> mAdsViewList) {
        imageLoader.init(ImageLoaderConfiguration.createDefault(getContext()));
        if (mAdsViewList == null) {
            return;
        }
        for (int i = 0; i < mAdsViewList.size(); i++) {
            final PromotionsBean play = mAdsViewList.get(i);
            ImageView img = new ImageView(getContext());
            img.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            img.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                   /* Intent intent = new Intent(getActivity(), WebActivity.class);
                    intent.putExtra("url", play.getUrl());
                    startActivity(intent);*/
                    showShortToast("点了viewpager");
                }
            });
            imageLoader.displayImage(play.getImage(), img, ImageLoaderOptions.options());
            imageViews.add(img);
            ImageView point = new ImageView(getContext());
            point.setImageResource(R.drawable.pagerselector);
            // 设置小圆点的布局参数
            int PointSize = getResources().getDimensionPixelSize(R.dimen.point_size);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(PointSize, PointSize);
            if (i > 0) {
                params.leftMargin = getResources().getDimensionPixelSize(R.dimen.point_margin);
                point.setSelected(false);
            } else {
                point.setSelected(true);
            }
            point.setLayoutParams(params);
            // 添加到容器里
            pointgroup.addView(point);
        }
        pageAdpter = new MyViewPageAdpter(imageViews);
        viewpager.setAdapter(pageAdpter);
        viewpager.addOnPageChangeListener(pageChangeListener);
    }

    ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            for (int i = 0; i < imageViews.size(); i++) {
                if (i != position){
                    pointgroup.getChildAt(i).setSelected(false);
                }else {
                    pointgroup.getChildAt(i).setSelected(true);
                }
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

    };

    private void initHandler() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                int currentPosition = viewpager.getCurrentItem();

                if(currentPosition == imageViews.size() - 1){
                    // 最后一页
                    viewpager.setCurrentItem(0,false);
                }else{
                    viewpager.setCurrentItem(currentPosition + 1);
                }

                // 一直给自己发消息
                mHandler.postDelayed(this,5000);
            }
        },5000);
    }
}
