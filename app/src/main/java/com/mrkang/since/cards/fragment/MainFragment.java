package com.mrkang.since.cards.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.activity.WebViewActivity;
import com.mrkang.since.cards.adpter.MainBankListAdpter;
import com.mrkang.since.cards.adpter.MyViewPageAdpter;
import com.mrkang.since.cards.base.BaseFragment;
import com.mrkang.since.cards.bean.NewMainDataBean;
import com.mrkang.since.cards.bean.PromotionsBean;
import com.mrkang.since.cards.contract.MainContract;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
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
public class MainFragment  extends BaseFragment implements MainContract.View{

    Unbinder unbinder;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.pointgroup)
    LinearLayout pointgroup;

    private List<View> imageViews = new ArrayList<>();
    private NewMainDataBean dataBean = new NewMainDataBean();
    private List<PromotionsBean> mAdsViewList = new ArrayList<PromotionsBean>();
    private List<NewMainDataBean.BanksBean> banksBeanList = new ArrayList<>();
    ImageLoader imageLoader = ImageLoader.getInstance();
    private MyViewPageAdpter pageAdpter;
    private MainBankListAdpter bankListAdpter;
    private GridLayoutManager gridLayoutManager;
    Handler mHandler = new Handler();
    private MainContract.Presenter mpresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_main, null);
        unbinder = ButterKnife.bind(this, view);
        initRecyclerView();
        initHandler();
        mpresenter.getHomeData(getContext());
        return view;
    }

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

    @Override
    public void onResume() {
        super.onResume();
        mpresenter.start();
    }

    public void initViewPager() {
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
                    Intent intent = new Intent(getActivity(), WebViewActivity.class);
                    intent.putExtra("url", play.getUrl());
                    startActivity(intent);
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

    public void initRecyclerView() {
        bankListAdpter = new MainBankListAdpter(banksBeanList);
        gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(bankListAdpter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
    }

    public void setHomeData(NewMainDataBean mainDataBean) {
        if (mainDataBean != null && mainDataBean.getPromotions() != null) {
            mAdsViewList.clear();
            mAdsViewList.addAll(mainDataBean.getPromotions());
            banksBeanList.clear();
            banksBeanList.addAll(mainDataBean.getBanks());
            bankListAdpter.notifyDataSetChanged();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mpresenter = presenter;
    }
}
