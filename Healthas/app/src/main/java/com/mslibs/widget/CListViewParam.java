package com.mslibs.widget;

import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;

public class CListViewParam {

	private final String TAG = "CListViewParam";

	public static final Boolean VISIBLE = true;
	public static final Boolean GONE = false;

	// private int mViewRsID = 0;
	private int mItemRsID = 0; // 单个view的id
	private Object mDate = null; // 付值数据
	private boolean mVisibility = true; // 单个可见设置参数
	private boolean mIsSetVisibility = false; // 是否设置可见参数

	private OnClickListener onClickListener = null; // 单个view点击事件
	private OnKeyListener onKeyListener = null; // 单个view点击事件
	
	private Object mTag = null;// 付给view.tag
	private boolean isImgAsync = false;// 是否异步读取图片
	private int imgRoundCorner = 0;
	
	private int textViewPaintFlags = -1; 

	public CListViewParam(int ItemRsID, Object Date, Boolean Visibility) {
		mItemRsID = ItemRsID;
		mDate = Date;
		mVisibility = Visibility;
		mIsSetVisibility = true;
	}

	public CListViewParam(int ItemRsID, Object Date) {
		mItemRsID = ItemRsID;
		mDate = Date;
		mIsSetVisibility = false;
	}

	public void setItemTag(Object tag) {
		mTag = tag;
	}

	public void setImgAsync(boolean b) {
		isImgAsync = b;
	}

	public boolean getImgAsync() {
		return isImgAsync;
	}

	public Object getItemTag() {
		return mTag;
	}

	public int getItemRsID() {
		return mItemRsID;
	}

	public Object getDate() {
		return mDate;
	}

	public boolean getVisibility() {
		return mVisibility;
	}

	public boolean isSetVisibility() {
		return mIsSetVisibility;
	}

	public OnClickListener getOnclickListner() {
		return onClickListener;
	}

	public void setOnclickLinstener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public OnKeyListener getOnKeyListener() {
		return onKeyListener;
	}

	public void setOnKeyListener(OnKeyListener onKeyListener) {
		this.onKeyListener = onKeyListener;
	}

	public int getImgRoundCorner() {
		return imgRoundCorner;
	}

	public void setImgRoundCorner(int imgRoundCorner) {
		this.imgRoundCorner = imgRoundCorner;
	}

	public int getTextViewPaintFlags() {
		return textViewPaintFlags;
	}

	public void setTextViewPaintFlags(int textViewPaintFlags) {
		//Paint.UNDERLINE_TEXT_FLAG 下划线
		//Paint.STRIKE_THRU_TEXT_FLAG 删除线
		this.textViewPaintFlags = textViewPaintFlags;
	}
}
