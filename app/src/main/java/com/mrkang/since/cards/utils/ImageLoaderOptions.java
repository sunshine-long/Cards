package com.mrkang.since.cards.utils;

import android.graphics.Bitmap;

import com.mrkang.since.cards.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;


/**
 * Created by administer on 2016/9/13.
 */
public class ImageLoaderOptions {
    /**
     * 新闻列表中用到的图片加载配置
     */
    public static DisplayImageOptions options() {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.image_loading1) // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.image_loading1) // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.image_loading1) // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true) // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true) // 设置下载的图片是否缓存在SD卡中
                // .displayer(new RoundedBitmapDisplayer(20)) // 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565).build();
        return options;
    }

    public static DisplayImageOptions roundedoptions(){
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.image_loading1) // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.image_loading1) // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.image_loading1) // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true) // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true) // 设置下载的图片是否缓存在SD卡中
                 .displayer(new RoundedBitmapDisplayer(10)) // 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565).build();
        return options;
    }


}
