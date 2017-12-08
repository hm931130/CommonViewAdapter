package com.hm.commonviewadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public abstract class SingleAdapter<T> extends BaseAdapter<T> {
    private int mItemLayoutId;

    public SingleAdapter(Context context, List<T> data, int layoutId) {
        super(context, data);
        this.mItemLayoutId = layoutId;
    }

    @Override
    public View getView(ViewGroup viewGroup, int pos, T data) {
        View itemView = mInflater.inflate(mItemLayoutId, viewGroup, false);
        onBindView(viewGroup, itemView, data, pos);
        return itemView;
    }

    public abstract void onBindView(ViewGroup parent, View itemView, T data, int pos);
}
