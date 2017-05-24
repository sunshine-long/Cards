package com.mrkang.since.cards.utils;

import android.util.Log;

/**
 * Created by 康龙 on 2017/5/9.
 */

public class LogUtils {
    public static final boolean isDebug = true;
//    private static final String TAG = "LogUtils";

    /**
     * 打印一个debug等级的 log
     */
    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d("jiemo_" + tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e("jiemo_" + tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(Class cls, String msg) {
        if (isDebug) {
            Log.e("jiemo_" + cls.getSimpleName(), msg);
        }
    }
}
