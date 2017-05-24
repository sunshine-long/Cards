package com.mrkang.since.cards.base;

import android.content.Context;
import android.widget.Toast;

import com.mrkang.since.cards.utils.LogUtils;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * Created by 康龙 on 2017/5/10.
 */

public abstract class BaseObserver<T> implements Observer<BaseEntity<T>> {
    private static final String TAG = "BaseObserver";
    private Context mContext;

    protected BaseObserver(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override
    public void onNext(BaseEntity<T> value) {
        if (value.isSuccess()) {
            T t = value.getData();
            onSuccess(t);
        } else {
            onResError(value.getMessage().getContent());
        }
    }

    @Override
    public void onError(Throwable e) {
        LogUtils.e(TAG, "error:" + e.toString());
    }

    @Override
    public void onComplete() {
        LogUtils.d(TAG, "onComplete");
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {
        LogUtils.d(TAG,"onSubscribe   "+ d);
    }

    protected abstract void onSuccess(T t);

    protected void onResError(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
