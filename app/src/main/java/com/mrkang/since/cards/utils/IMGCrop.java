package com.mrkang.since.cards.utils;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class IMGCrop {
	
	public static final int GET_IMAGE_BY_CAMERA = 0;//相机
	public static final int GET_IMAGE_FROM_PHONE = 1;//本地图片
	public static final int CROP_IMAGE = 2;//剪切图片
	public static Uri imageUriFromCamera;//相机拍照后的URI
	public static Uri cropImageUri;//图片剪切后的URI

	/**
	 * 打开相机,拍照后返回存入URI
	 * @param thiz
	 */
	public static void openCameraImage(final Activity thiz) {
		IMGCrop.imageUriFromCamera = IMGCrop.createImagePathUri(thiz);
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, IMGCrop.imageUriFromCamera);
		thiz.startActivityForResult(intent, IMGCrop.GET_IMAGE_BY_CAMERA);
	}
	public static void openCameraImage(final Fragment thiz) {
		IMGCrop.imageUriFromCamera = IMGCrop.createImagePathUri(thiz.getActivity());
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, IMGCrop.imageUriFromCamera);
		thiz.startActivityForResult(intent, IMGCrop.GET_IMAGE_BY_CAMERA);
	}
	/**
	 * 打开相册,选择图片后返回URI
	 * @param thiz
	 */
	public static void openLocalImage(final Activity thiz) {
		Intent intent = new Intent();
		intent.setType("image/*");
		intent.setAction(Intent.ACTION_PICK);
		thiz.startActivityForResult(intent, IMGCrop.GET_IMAGE_FROM_PHONE);
	}
	public static void openLocalImage(final Fragment thiz) {
		Intent intent = new Intent();
		intent.setType("image/*");
		intent.setAction(Intent.ACTION_PICK);
		thiz.startActivityForResult(intent, IMGCrop.GET_IMAGE_FROM_PHONE);
	}
	/**
	 * 剪切图片后存入URI
	 * @param thiz
	 * @param srcUri
	 */
	public static void cropImageSquare(Activity thiz, Uri srcUri,int outputXY) {
		IMGCrop.cropImageUri = IMGCrop.createImagePathUri(thiz);
		
		Intent intent = new Intent("com.android.camera.action.CROP");
		intent.setDataAndType(srcUri, "image/*");
		intent.putExtra("crop", "true");
		intent.putExtra("aspectX", 1);
		intent.putExtra("aspectY", 1);
		intent.putExtra( "outputX", outputXY);
        intent.putExtra( "outputY", outputXY);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, IMGCrop.cropImageUri);
		intent.putExtra("return-data", false);
		thiz.startActivityForResult(intent, CROP_IMAGE);
	}
	public static void cropImageSquare(Fragment thiz, Uri srcUri,int outputXY) {
		IMGCrop.cropImageUri = IMGCrop.createImagePathUri(thiz.getActivity());

		Intent intent = new Intent("com.android.camera.action.CROP");
		intent.setDataAndType(srcUri, "image/*");
		intent.putExtra("crop", "true");
		intent.putExtra("aspectX", 1);
		intent.putExtra("aspectY", 1);
		intent.putExtra( "outputX", outputXY);
        intent.putExtra( "outputY", outputXY);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, IMGCrop.cropImageUri);
		intent.putExtra("return-data", false);
		thiz.startActivityForResult(intent, CROP_IMAGE);
	}

	/**
	 * 通过时间创建图片URI
	 * @param context
	 * @return
	 */
	public static Uri createImagePathUri(Context context) {
		Uri imageFilePath = null;
		String status = Environment.getExternalStorageState();
		SimpleDateFormat timeFormatter = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA);
		long time = System.currentTimeMillis();
		String imageName = timeFormatter.format(new Date(time));
		ContentValues values = new ContentValues(3);
		values.put(MediaStore.Images.Media.DISPLAY_NAME, imageName);
		values.put(MediaStore.Images.Media.DATE_TAKEN, time);
		values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
		if (status.equals(Environment.MEDIA_MOUNTED)) {
			imageFilePath = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
		} else {
			imageFilePath = context.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, values);
		}
		return imageFilePath;
	}

}
