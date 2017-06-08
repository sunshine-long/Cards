package com.mrkang.since.cards.adpter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.bean.CategoriesBean;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhangxutong on 2016/2/16.
 */
public class GridViewAdapter extends BaseAdapter {
    private List<CategoriesBean> mDatas;
    private LayoutInflater mLayoutInflater;
    /**
     * 页数下标,从0开始(通俗讲第几页)
     */
    private int mIndex;
    /**
     * 每页显示最大条目个数 ,默认是dimes.xml里 HomePageHeaderColumn 属性值的两倍(每页多少个图标)
     */
    private int mPageSize;

    ImageLoader imageLoader = ImageLoader.getInstance();

    public GridViewAdapter(Context context, List<CategoriesBean> mDatas, int mIndex) {
        this.mDatas = mDatas;
        mLayoutInflater = LayoutInflater.from(context);
        this.mIndex = mIndex;
        mPageSize = context.getResources().getInteger(R.integer.HomePageHeaderColumn) * 2;
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
    }

    /**
     * 先判断数据集的大小是否足够显示满本页？mDatas.size() > (mIndex+1)*mPageSize,
     * 如果够，则直接返回每一页显示的最大条目个数mPageSize,
     * 如果不够，则有几项返回几,(mDatas.size() - mIndex * mPageSize);(说白了 最后一页就显示剩余item)
     */
    @Override
    public int getCount() {
        return mDatas.size() > (mIndex + 1) * mPageSize ? mPageSize : (mDatas.size() - mIndex * mPageSize);

    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position + mIndex * mPageSize);
    }

    @Override
    public long getItemId(int position) {
        return position + mIndex * mPageSize;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.i("TAG", "position:" + position + "   :" + this);
        ViewHolder vh = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.recycler_maintop_item, parent, false);
            vh = new ViewHolder(convertView);
            vh.itemTitle = (TextView) convertView.findViewById(R.id.item_title);
            vh.itemIcon = (ImageView) convertView.findViewById(R.id.item_icon);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        /**
         * 在给View绑定显示的数据时，计算正确的position = position + mIndex * mPageSize，
         */
        int pos = position + mIndex * mPageSize;
        vh.itemTitle.setText(mDatas.get(pos).getName());
        imageLoader.displayImage(mDatas.get(pos).getIcon(), vh.itemIcon, ImageLoaderOptions.options());
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.item_icon)
        ImageView itemIcon;
        @BindView(R.id.item_title)
        TextView itemTitle;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}