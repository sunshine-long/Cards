package com.mrkang.since.cards.fragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mrkang.since.cards.R;
import com.mrkang.since.cards.contract.MineContract;
import com.mrkang.since.cards.utils.BitmapUtils;
import com.mrkang.since.cards.utils.IMGCrop;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment implements MineContract.View{
    @BindView(R.id.my_head)
    ImageView myHead;
    @BindView(R.id.mine_head_bg)
    FrameLayout mineHeadBg;
    @BindView(R.id.mybanks)
    LinearLayout mybanks;
    @BindView(R.id.mycard)
    LinearLayout mycard;
    @BindView(R.id.user_advice)
    LinearLayout userAdvice;
    @BindView(R.id.setting)
    LinearLayout setting;
    Unbinder unbinder;

    private MineContract.Presenter mPresenter;

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.mine_head_bg, R.id.mybanks, R.id.mycard, R.id.user_advice, R.id.setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mine_head_bg:
                avaterHead();
                break;
            case R.id.mybanks:
                break;
            case R.id.mycard:
                break;
            case R.id.user_advice:
                break;
            case R.id.setting:
                break;
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void setPresenter(MineContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void avaterHead() {
        AlertDialog.Builder builder_avarta = new AlertDialog.Builder(getContext());
        builder_avarta.setTitle("修改头像");
        // 指定下拉列表的显示数据
        final String[] upload = {"拍照上传", "本地上传"};
        // 设置一个下拉的列表选择项
        builder_avarta.setItems(upload,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        switch (i) {
                            case 0:
                                // 打开相机
                                IMGCrop.openCameraImage(MineFragment.this);
                                break;

                            case 1:
                                // 打开图库
                                IMGCrop.openLocalImage(MineFragment.this);
                                break;
                            default:
                                break;
                        }
                    }
                });
        Dialog dialog_avarta = builder_avarta.create();
        dialog_avarta.setCanceledOnTouchOutside(true);
        dialog_avarta.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case IMGCrop.GET_IMAGE_BY_CAMERA:
                if (IMGCrop.imageUriFromCamera != null){
                    IMGCrop.cropImageSquare(MineFragment.this,IMGCrop.imageUriFromCamera,160);
                }

                break;
            case IMGCrop.GET_IMAGE_FROM_PHONE:
                if (data != null && data.getData() != null){
                    IMGCrop.cropImageSquare(MineFragment.this,data.getData(),160);
                }
                break;
            case IMGCrop.CROP_IMAGE:
                if (IMGCrop.cropImageUri != null){
                    try {
                        Bitmap imageBitmap = BitmapUtils.getBitmapFormUri(getActivity(),IMGCrop.cropImageUri);
                        myHead.setImageBitmap(imageBitmap);
                        String bitmapString = BitmapUtils.convertIconToString(imageBitmap);
                        mPresenter.loadUpHead(bitmapString);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;


        }
    }
}
