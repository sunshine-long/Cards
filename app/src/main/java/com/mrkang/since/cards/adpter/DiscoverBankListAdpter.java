package com.mrkang.since.cards.adpter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mrkang.since.cards.R;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 康龙 on 2017/5/24.
 */

public class DiscoverBankListAdpter extends BaseQuickAdapter<ContentBean,DiscoverBankListAdpter.ViewHolder> {

    ImageLoader imageLoader = ImageLoader.getInstance();

    public DiscoverBankListAdpter(Context context,@Nullable List<ContentBean> data) {
        super(R.layout.recycler_mainlistshop_item, data);
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
    }

    @Override
    protected void convert(ViewHolder helper, ContentBean item) {
        helper.address.setText(item.getAddress());
        helper.shopName.setText(item.getName());
        imageLoader.displayImage(item.getImage(),helper.image, ImageLoaderOptions.options());
    }


    static class ViewHolder extends BaseViewHolder {
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.shop_name)
        TextView shopName;
        @BindView(R.id.location)
        ImageView location;
        @BindView(R.id.address)
        TextView address;
        @BindView(R.id.distance_main_tv)
        TextView distanceMainTv;
        @BindView(R.id.bank_linearly)
        LinearLayout bankLinearly;
        @BindView(R.id.lock_draw_iv)
        ImageView lockDrawIv;
        @BindView(R.id.lock_draw_tv)
        TextView lockDrawTv;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
