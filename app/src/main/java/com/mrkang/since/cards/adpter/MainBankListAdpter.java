package com.mrkang.since.cards.adpter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mrkang.since.cards.R;
import com.mrkang.since.cards.bean.NewMainDataBean;
import com.mrkang.since.cards.utils.ImageLoaderOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 康龙 on 2017/5/11.
 */

public class MainBankListAdpter  extends BaseQuickAdapter<NewMainDataBean.BanksBean,BaseViewHolder>{
    public MainBankListAdpter(@Nullable List<NewMainDataBean.BanksBean> data) {
        super(R.layout.main_banklist_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewMainDataBean.BanksBean item) {
        ImageLoader.getInstance().displayImage(item.getImage(),(ImageView) helper.getView(R.id.main_bank_image), ImageLoaderOptions.roundedoptions());
    }
}
