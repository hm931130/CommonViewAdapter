package com.hm.commonviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public abstract class BaseAdapter<T> implements IViewGroupAdapter {

    protected List<T> mDatas;
    protected Context mContext;
    protected LayoutInflater mInflater;

    public BaseAdapter(Context context, List<T> data) {
        this.mContext = context;
        this.mDatas = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(ViewGroup parent, int pos) {
        return getView(parent, pos, mDatas.get(pos));
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    public abstract View getView(ViewGroup viewGroup, int pos, T data);
}
