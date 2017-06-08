package com.mrkang.since.cards.activity;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WebViewActivity extends BaseActivity {


    @BindView(R.id.imageback)
    ImageView imageback;
    @BindView(R.id.webview)
    WebView payWeb;

    @Override
    protected void bindview() {
        ButterKnife.bind(this);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_web_view;
    }

    @Override
    protected void initView() {
        String url = getIntent().getStringExtra("url");
        payWeb.setWebViewClient(new WebViewClient() { // 通过webView打开链接，不调用系统浏览器
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        payWeb.setInitialScale(25);
        WebSettings webSettings = payWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        payWeb.getSettings().setUseWideViewPort(true);
        payWeb.getSettings().setLoadWithOverviewMode(true);
        payWeb.loadUrl(url);
    }

    @Override
    protected void initDatas() {

    }

    @OnClick(R.id.imageback)
    public void onViewClicked() {
        finish();
    }
}
