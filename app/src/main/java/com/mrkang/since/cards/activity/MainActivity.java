package com.mrkang.since.cards.activity;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.base.BaseActivity;
import com.mrkang.since.cards.fragment.DiscoverFragment;
import com.mrkang.since.cards.fragment.MainFragment;
import com.mrkang.since.cards.fragment.MineFragment;
import com.mrkang.since.cards.model.DiscoverModel;
import com.mrkang.since.cards.presenter.DiscoverPresenter;
import com.mrkang.since.cards.presenter.MainPresenter;
import com.mrkang.since.cards.presenter.MinePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity{

    @BindView(R.id.content_fl)
    FrameLayout contentFl;
    @BindView(R.id.radio_button_home)
    RadioButton radioButtonHome;
    @BindView(R.id.radio_button_discovery)
    RadioButton radioButtonDiscovery;
    @BindView(R.id.radio_button_profile)
    RadioButton radioButtonProfile;
    @BindView(R.id.radio_group_button)
    RadioGroup radioGroupButton;
    private Fragment currentFragment;
    private MainFragment mainFragment;
    private MainPresenter mainPresenter;
    private DiscoverFragment discoverFragment;
    private DiscoverPresenter discoverPresenter;
    private MineFragment mineFragment;
    private MinePresenter minePresenter;

    @Override
    protected void bindview() {
        ButterKnife.bind(this);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        setDefaultFragment();
        mainPresenter = new MainPresenter(mainFragment);
        radioGroupButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.radio_button_home:
                        if (mainFragment == null){
                            mainFragment = new MainFragment();
                        }
                        addOrShowFragment(getSupportFragmentManager().beginTransaction(),mainFragment);
                        break;
                    case R.id.radio_button_discovery:
                        if (discoverFragment == null){
                            discoverFragment = new DiscoverFragment();
                        }
                        discoverPresenter = new DiscoverPresenter(discoverFragment,new DiscoverModel());
                        addOrShowFragment(getSupportFragmentManager().beginTransaction(),discoverFragment);
                        break;
                    case R.id.radio_button_profile:
                        if (mineFragment == null){
                            mineFragment = new MineFragment();
                        }
                        minePresenter = new MinePresenter(MainActivity.this,mineFragment);
                        addOrShowFragment(getSupportFragmentManager().beginTransaction(),mineFragment);
                        break;
                }
            }
        });
        radioButtonHome.setChecked(true);
    }

    @Override
    protected void initDatas() {

    }

    private void setDefaultFragment() {

        if (mainFragment == null) {
            mainFragment = new MainFragment();
        }
        if (!mainFragment.isAdded()) {
            // 提交事务
            getSupportFragmentManager().beginTransaction().add(R.id.content_fl, mainFragment).commit();

            // 记录当前Fragment
            currentFragment = mainFragment;
        }
    }

    /**
     * 添加或者显示碎片
     *
     * @param transaction
     * @param fragment
     */
    private void addOrShowFragment(FragmentTransaction transaction,
                                   Fragment fragment) {
        if (currentFragment == fragment)
            return;

        if (!fragment.isAdded()) { // 如果当前fragment未被添加，则添加到Fragment管理器中
            transaction.hide(currentFragment).add(R.id.content_fl, fragment).commit();
        } else {
            transaction.hide(currentFragment).show(fragment).commit();
        }
        currentFragment = fragment;
    }

}
