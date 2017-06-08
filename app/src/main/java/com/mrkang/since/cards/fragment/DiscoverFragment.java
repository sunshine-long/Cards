package com.mrkang.since.cards.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.adpter.GridViewAdapter;
import com.mrkang.since.cards.adpter.MyViewPageAdpter;
import com.mrkang.since.cards.adpter.MyViewPagerAdapter;
import com.mrkang.since.cards.adpter.NestedExpandaleListView;
import com.mrkang.since.cards.adpter.ShopExpandableListAdpter;
import com.mrkang.since.cards.base.BaseFragment;
import com.mrkang.since.cards.bean.CategoriesBean;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.bean.MainShopListBean;
import com.mrkang.since.cards.bean.PromotionsBean;
import com.mrkang.since.cards.contract.DiscoverContract;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.mrkang.since.cards.widget.MyGridView;
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
public class DiscoverFragment extends BaseFragment implements DiscoverContract.View {


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
    @BindView(R.id.mScrollView)
    ScrollView mScrollView;
    Unbinder unbinder;
    @BindView(R.id.expandablelistview)
    NestedExpandaleListView expandablelistview;

    private DiscoverContract.Presenter mPresenter;
    ImageLoader imageLoader = ImageLoader.getInstance();
    private MyViewPageAdpter pageAdpter;
    private List<View> imageViews = new ArrayList<>();
    Handler mHandler = new Handler();
    private ShopExpandableListAdpter listAdpter;
    private ImageView[] mTips = null;
    private ArrayList<View> mViewPagerGridList;
    LayoutInflater mInflater;
    private GridViewAdapter gridViewAdapter;
    private MyViewPagerAdapter myViewPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_discover, null);
        mInflater = inflater;
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
    public void initShopListView(MainShopListBean shopListBean) {
        List<ContentBean> contentBeanList = shopListBean.getContent();
        listAdpter = new ShopExpandableListAdpter(getContext(), contentBeanList);
        expandablelistview.setAdapter(listAdpter);
        expandablelistview.setGroupIndicator(null);
        listAdpter.notifyDataSetChanged();
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

    @Override
    public void initGridViewPage(List<CategoriesBean> mainTopDatas) {
        //塞GridView至ViewPager中：
        final int pageSize = getResources().getInteger(R.integer.HomePageHeaderColumn) * 2;
        //一共的页数等于 总数/每页数量，并取整。
        int pageCount = (int) Math.ceil(mainTopDatas.size() * 1.0 / pageSize);
        mTips = new ImageView[pageCount];
        pointgroup2.removeAllViewsInLayout();
        mViewPagerGridList = new ArrayList<View>();
        for (int index = 0; index < pageCount; index++) {
            //每个页面都是inflate出一个新实例
            MyGridView grid = (MyGridView) mInflater.inflate(R.layout.item_viewpager, vp, false);
            gridViewAdapter = new GridViewAdapter(getActivity(), mainTopDatas, index);
            grid.setAdapter(gridViewAdapter);
            mViewPagerGridList.add(grid);
            final int finalIndex = index;
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    /*int realposition = finalIndex * pageSize + i;
                    Intent intent = new Intent(getContext(), CategoryActivity.class);
                    intent.putExtra("categoryId", mainTopDatas.get(realposition).getId());
                    startActivity(intent);*/
                }
            });

            ImageView point = new ImageView(getContext());
            point.setImageResource(R.drawable.pagerselector);
            // 设置小圆点的布局参数
            int PointSize = getResources().getDimensionPixelSize(R.dimen.point_size);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(PointSize, PointSize);
            if (index > 0) {
                params.leftMargin = getResources().getDimensionPixelSize(R.dimen.point_margin);
                point.setSelected(false);
            } else {
                point.setSelected(true);
            }
            point.setLayoutParams(params);
            // 添加到容器里
            pointgroup2.addView(point);
        }
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < mTips.length; i++) {
                    if (i != position) {
                        pointgroup2.getChildAt(i).setSelected(false);
                    } else {
                        pointgroup2.getChildAt(i).setSelected(true);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        myViewPagerAdapter = new MyViewPagerAdapter(mViewPagerGridList);
        vp.setAdapter(myViewPagerAdapter);
    }

    @Override
    public void loadMoreShop() {

    }

    ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            for (int i = 0; i < imageViews.size(); i++) {
                if (i != position) {
                    pointgroup.getChildAt(i).setSelected(false);
                } else {
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

                if (currentPosition == imageViews.size() - 1) {
                    // 最后一页
                    viewpager.setCurrentItem(0, false);
                } else {
                    viewpager.setCurrentItem(currentPosition + 1);
                }

                // 一直给自己发消息
                mHandler.postDelayed(this, 5000);
            }
        }, 5000);
    }
}
