package com.hm.commonviewadapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public interface IViewGroupAdapter {
    /**
     * ViewGroup调用获取ItemView
     */
    View getView(ViewGroup parent, int pos);

    /**
     * ViewGroup调用 得到itemCount
     */
    int getCount();
}
