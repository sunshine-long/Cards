package com.mrkang.since.cards.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.bean.ContentBean;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 康龙 on 2017/6/2.
 */

public class ShopExpandableListAdpter extends BaseExpandableListAdapter {

    private final LayoutInflater inflater;
    private List<ContentBean> mDatas;
    ImageLoader imageLoader = ImageLoader.getInstance();

    public ShopExpandableListAdpter(Context context, List<ContentBean> data) {
        this.mDatas = data;
        inflater = LayoutInflater.from(context);
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
    }

    @Override
    public int getGroupCount() {
        return mDatas.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        int count = mDatas.get(groupPosition).getActivities().size();
        return count > 2 ? (count - 2) : 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        FatherViewHolder fatherViewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.father_listitem, null);
            fatherViewHolder = new FatherViewHolder(convertView);
            convertView.setTag(fatherViewHolder);
        } else {
            fatherViewHolder = (FatherViewHolder) convertView.getTag();
        }
        fatherViewHolder.shopName.setText(mDatas.get(groupPosition).getName());
        imageLoader.displayImage(mDatas.get(groupPosition).getImage(), fatherViewHolder.image, ImageLoaderOptions.options());
        fatherViewHolder.address.setText(mDatas.get(groupPosition).getAddress());
        fatherViewHolder.distanceMainTv.setText(mDatas.get(groupPosition).getDistance() + "km");
        int count = mDatas.get(groupPosition).getActivities().size();
        if (count >= 2) {
            fatherViewHolder.discountLy.setVisibility(View.VISIBLE);
            fatherViewHolder.discount1Ly.setVisibility(View.VISIBLE);
            fatherViewHolder.discountTv.setText(mDatas.get(groupPosition).getActivities().get(0).getActivityName());
            imageLoader.displayImage(mDatas.get(groupPosition).getActivities().get(0).getBankIcon(), fatherViewHolder.bankimage1 , ImageLoaderOptions.options());
            imageLoader.displayImage(mDatas.get(groupPosition).getActivities().get(1).getBankIcon(), fatherViewHolder.bankimage2 , ImageLoaderOptions.options());
            if (mDatas.get(groupPosition).getActivities().get(0).getTypeName().equals("折")) {
                fatherViewHolder.discountIv.setImageResource(R.drawable.discount);
            } else {
                fatherViewHolder.discountIv.setImageResource(R.drawable.discount_1);
            }
            fatherViewHolder.discount1Tv.setText(mDatas.get(groupPosition).getActivities().get(1).getActivityName());
            if (mDatas.get(groupPosition).getActivities().get(1).getTypeName().equals("折")) {
                fatherViewHolder.discount1Iv.setImageResource(R.drawable.discount);
            } else {
                fatherViewHolder.discount1Iv.setImageResource(R.drawable.discount_1);
            }

        } else if (count == 1) {
            fatherViewHolder.discountLy.setVisibility(View.VISIBLE);
            fatherViewHolder.discount1Ly.setVisibility(View.GONE);
            fatherViewHolder.discountTv.setText(mDatas.get(groupPosition).getActivities().get(0).getActivityName());
            imageLoader.displayImage(mDatas.get(groupPosition).getActivities().get(0).getBankIcon(), fatherViewHolder.bankimage1 , ImageLoaderOptions.options());
            if (mDatas.get(groupPosition).getActivities().get(0).getTypeName().equals("折")) {
                fatherViewHolder.discountIv.setImageResource(R.drawable.discount);
            } else {
                fatherViewHolder.discountIv.setImageResource(R.drawable.discount_1);
            }
        } else {
            fatherViewHolder.discountLy.setVisibility(View.GONE);
            fatherViewHolder.discount1Ly.setVisibility(View.GONE);
        }
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildViewHolder childViewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.child_listitem, null);
            childViewHolder = new ChildViewHolder(convertView);
            convertView.setTag(childViewHolder);
        } else {
            childViewHolder = (ChildViewHolder) convertView.getTag();
        }
        int count = mDatas.get(groupPosition).getActivities().size();
        int realpostion = count - 2;
        if (realpostion>0){
            childViewHolder.discountTv.setText(mDatas.get(groupPosition).getActivities().get(realpostion).getActivityName());
            imageLoader.displayImage(mDatas.get(groupPosition).getActivities().get(realpostion).getBankIcon(), childViewHolder.bankimage , ImageLoaderOptions.options());
            if (mDatas.get(groupPosition).getActivities().get(realpostion).getTypeName().equals("折")) {
                childViewHolder.discountIv.setImageResource(R.drawable.discount);
            } else {
                childViewHolder.discountIv.setImageResource(R.drawable.discount_1);
            }
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    static class FatherViewHolder {
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
        @BindView(R.id.discount_iv)
        ImageView discountIv;
        @BindView(R.id.bankimage_1)
        ImageView bankimage1;
        @BindView(R.id.discount_tv)
        TextView discountTv;
        @BindView(R.id.discount_ly)
        LinearLayout discountLy;
        @BindView(R.id.discount_1_iv)
        ImageView discount1Iv;
        @BindView(R.id.bankimage_2)
        ImageView bankimage2;
        @BindView(R.id.discount_1_tv)
        TextView discount1Tv;
        @BindView(R.id.discount_1_ly)
        LinearLayout discount1Ly;

        FatherViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    class ChildViewHolder {
        @BindView(R.id.discount_iv)
        ImageView discountIv;
        @BindView(R.id.bankimage)
        ImageView bankimage;
        @BindView(R.id.discount_tv)
        TextView discountTv;
        @BindView(R.id.discount_ly)
        LinearLayout discountLy;

        ChildViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
