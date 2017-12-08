package com.hm.commonviewadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public abstract class MulTypeAdapter<T extends IMulTypeHelper> extends BaseAdapter<T> {
    public MulTypeAdapter(Context context, List<T> data) {
        super(context, data);
    }

    @Override
    public View getView(ViewGroup parent, int pos, T data) {
        View itemView = mInflater.inflate(data.getItemLayoutId(), parent, false);
        onBindView(parent, itemView, data, pos);
        return itemView;
    }

    public abstract void onBindView(ViewGroup parent, View itemView, T data, int pos);
}
